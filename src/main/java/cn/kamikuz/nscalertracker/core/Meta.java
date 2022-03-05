package cn.kamikuz.nscalertracker.core;

import java.util.Objects;

public record Meta(Brand brand, String product_id, int id, String name) {
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Meta meta)) return false;

    if (id != meta.id) return false;
    if (brand != meta.brand) return false;
    return Objects.equals(product_id, meta.product_id);
  }

  @Override
  public int hashCode() {
    int result = brand != null ? brand.hashCode() : 0;
    result = 31 * result + (product_id != null ? product_id.hashCode() : 0);
    result = 31 * result + id;
    return result;
  }
}
