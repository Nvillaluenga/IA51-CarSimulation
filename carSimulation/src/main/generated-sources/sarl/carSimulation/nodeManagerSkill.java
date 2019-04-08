package carSimulation;

import carSimulation.NodeObj;
import carSimulation.nodeManager;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;

@SarlSpecification("0.8")
@SarlElementType(21)
@SuppressWarnings("all")
public class nodeManagerSkill extends Skill implements nodeManager {
  public NodeObj getNode() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @SyntheticMember
  public nodeManagerSkill() {
    super();
  }
  
  @SyntheticMember
  public nodeManagerSkill(final Agent agent) {
    super(agent);
  }
}
