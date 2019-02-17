/*
 * @category Design Pattern Tutorial
 * @package Interpreter Sample
 * @author Dmitry Sheiko <me@dsheiko.com>
 * @link http://dsheiko.com
 */
(function() {

var View_Template = function() {
    var _template = null, _vars = [];

    return {
        assign: function(key, val) {
            _vars[key] = val;
        },
        setTemplate: function (template) {
            _template = template;
        },
        getTemplate: function () {
            return _template;
        },
        getVars: function () {
            return _vars;
        }
    }
}

var Web_Template_Interpreter = function(viewTemplate) {
    var _viewTemplate = viewTemplate;
    return {
        getInterpreted: function() {
            var tpl = _viewTemplate.getTemplate();
            var vars = _viewTemplate.getVars();
            for (var key in vars) {
                var re = new RegExp("\{" + key + "\}", 'g');
                tpl = tpl.replace(re, vars[key]);
            };
            return tpl;
        }
    }
}

/**
 * Usage
 */

var tmp = new View_Template();
tmp.setTemplate('<article><header><h2>{title}</h2></header>'
+ '<section>{text}</section></article>');
tmp.assign('title', 'Article Title');
tmp.assign('text', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit');
var interpreter = new Web_Template_Interpreter(tmp);
console.log(interpreter.getInterpreted());

// Output
// <article><header><h2>Article Title</h2></header>
// <section>Lorem ipsum dolor sit amet, consectetur adipisicing elit</section></article>

}());
