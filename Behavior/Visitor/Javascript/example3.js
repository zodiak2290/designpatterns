// see http://d.hatena.ne.jp/ashigeru/20090113/1231855642

var calc = {
  add: function (node) {
    return visit(this, node.l) + visit(this, node.r);
  },
  sub: function (node) {
    return visit(this, node.l) - visit(this, node.r);
  },
  val: function (node) {
    return node.val;
  }
};

var dump = {
  add: function (node) {
    return visit(this, node.l) + ' + ' + visit(this, node.r);
  },
  sub: function (node) {
    return visit(this, node.l) + ' - '  +  visit(this, node.r);
  },
  val: function (node) {
    return String(node.val);
  }
};

var node = {tag: 'add',
  l: {tag: 'val', val: 2},
  r: {tag: 'sub',
    l: {tag: 'val', val: 3},
    r: {tag: 'val', val: 1}
  }
};

function visit(visitor, node) {
  return visitor[node.tag].call(visitor, node);
}

console.log(visit(calc, node));
console.log(visit(dump, node));