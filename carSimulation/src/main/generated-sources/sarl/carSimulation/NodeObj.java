package carSimulation;

import carSimulation.Edge;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class NodeObj {
  private final UUID ID;
  
  private final int x;
  
  private final int y;
  
  private ArrayList<Edge> edges = CollectionLiterals.<Edge>newArrayList();
  
  NodeObj(final UUID ID, final int x, final int y) {
    this.ID = ID;
    this.x = x;
    this.y = y;
  }
  
  public boolean addEdge(final Edge edge) {
    return this.edges.add(edge);
  }
  
  @Pure
  public double distanceNode(final NodeObj node) {
    double x = 0;
    double y = 0;
    double dis = 0;
    x = (this.x - node.x);
    y = (this.y - node.y);
    double _sqrt = Math.sqrt(((x * x) + (y * y)));
    dis = ((double) _sqrt);
    return dis;
  }
  
  @Pure
  public int getx() {
    return this.x;
  }
  
  @Pure
  public int gety() {
    return this.y;
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
    NodeObj other = (NodeObj) obj;
    if (!Objects.equals(this.ID, other.ID)) {
      return false;
    }
    if (other.x != this.x)
      return false;
    if (other.y != this.y)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.ID);
    result = prime * result + this.x;
    result = prime * result + this.y;
    return result;
  }
}
