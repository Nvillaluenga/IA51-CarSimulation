package carSimulation;

import carSimulation.NodeObj;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;

@FunctionalInterface
@SarlSpecification("0.8")
@SarlElementType(19)
@SuppressWarnings("all")
public interface nodeManager extends Capacity {
  public abstract NodeObj getNode();
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends nodeManager> extends Capacity.ContextAwareCapacityWrapper<C> implements nodeManager {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public NodeObj getNode() {
      try {
        ensureCallerInLocalThread();
        return this.capacity.getNode();
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
