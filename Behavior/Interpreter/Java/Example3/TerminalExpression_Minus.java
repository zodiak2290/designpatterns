import java.util.*;
class TerminalExpression_Minus implements Expression {
   public void interpret(Stack<Integer> s)  { 
   		int tmp = s.pop(); 
   		s.push( s.pop() - tmp ); 
   	}
}