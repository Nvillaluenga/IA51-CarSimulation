package carSimulation;

import carSimulation.Car;
import carSimulation.NodeObj;
import com.google.common.base.Objects;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class Edge {
  private final NodeObj origin;
  
  private final NodeObj destination;
  
  private int maxSpeed;
  
  private double value;
  
  private ArrayList<Car> objects = CollectionLiterals.<Car>newArrayList();
  
  Edge(final NodeObj orig, final NodeObj dest) {
    double aux = 0;
    aux = orig.distanceNode(dest);
    this.maxSpeed = 50;
    this.value = aux;
    this.origin = orig;
    this.destination = dest;
    this.origin.addEdge(this);
  }
  
  Edge(final NodeObj orig, final NodeObj dest, final double value, final int max) {
    this.maxSpeed = max;
    this.value = value;
    this.origin = orig;
    this.destination = dest;
    this.origin.addEdge(this);
  }
  
  @Pure
  public NodeObj getDest() {
    return this.destination;
  }
  
  @Pure
  public ArrayList<Car> getObjs() {
    return this.objects;
  }
  
  @Pure
  public double getVal() {
    return this.value;
  }
  
  public void removeObjs(final Car car) {
    for (int i = 0; (i < this.objects.size()); i++) {
      Car _get = this.objects.get(i);
      boolean _equals = Objects.equal(_get, car);
      if (_equals) {
        this.objects.remove(i);
      }
    }
  }
  
  public boolean addObjs(final Car car) {
    return this.objects.add(car);
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
    Edge other = (Edge) obj;
    if (other.maxSpeed != this.maxSpeed)
      return false;
    if (Double.doubleToLongBits(other.value) != Double.doubleToLongBits(this.value))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.maxSpeed;
    result = prime * result + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
    return result;
  }
}
