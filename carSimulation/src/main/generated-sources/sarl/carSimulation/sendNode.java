package carSimulation;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Nacho
 */
@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class sendNode extends Event {
  public final UUID originNode;
  
  public sendNode(final UUID o) {
    this.originNode = o;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    sendNode other = (sendNode) obj;
    if (!Objects.equals(this.originNode, other.originNode)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.originNode);
    return result;
  }
  
  /**
   * Returns a String representation of the sendNode event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("originNode", this.originNode);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 818204749L;
}
