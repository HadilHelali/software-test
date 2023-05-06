package tp_test1.junit.monprojet;

public class SommeArgent {
private int quantite;
private String unite;
public SommeArgent(int amount, String currency) {
quantite = amount;
unite = currency;
}
public int getQuantite() {
return quantite;
}
public String getUnite() {
return unite;
}
public SommeArgent add(SommeArgent m) throws UniteDistincteException {
if (!m.getUnite().equals(this.getUnite())) {
throw new UniteDistincteException(this, m);
}
else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    SommeArgent other = (SommeArgent) obj;
    if (quantite != other.quantite)
        return false;
    if (unite == null) {
        if (other.unite != null)
            return false;
    } else if (!unite.equals(other.unite))
        return false;
    return true;
}

public String toString() {
    return getQuantite() + " " + getUnite();
}
}
