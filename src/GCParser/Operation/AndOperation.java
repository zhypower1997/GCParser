package GCParser.Operation;
import YaoGC.*;
import GCParser.*;
public class AndOperation extends OpCircuitUser {
  public final static String NAME = "and";
  public AndOperation(){
    super(NAME);
  }
  public Circuit create_circuit( State[] operands ){
    return new AND_2L_L( operands[0].getWidth() );
  }
  public int circuit_id( State[] operands ){
    return operands[0].getWidth();
  }
  public State execute(State[] inputs, Circuit and ) throws Exception {
    return binaryOperation( and, inputs );
  }
  public int validate( Variable[] operands ) throws CircuitDescriptionException {
    binaryOperation( operands );
    return operands[0].validate();
  }
}