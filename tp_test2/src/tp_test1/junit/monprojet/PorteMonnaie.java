package tp_test1.junit.monprojet;

import java.util.HashMap;
public class PorteMonnaie {
private HashMap<String, Integer> contenu;
public HashMap<String, Integer> getContenu() {
return contenu;
}
public PorteMonnaie() {
contenu = new HashMap<String, Integer>();
}

public void ajouteSomme(SommeArgent sa) {
    String unite = sa.getUnite();
    int quantite = sa.getQuantite();
    if (contenu.containsKey(unite)) {
        quantite += contenu.get(unite);
    }
    contenu.put(unite, quantite);
}

public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("porte-monnaie :");
    for (String unite : contenu.keySet()) {
        SommeArgent sommeObjet = new SommeArgent(contenu.get(unite), unite);
        sb.append(sommeObjet.toString());
        sb.append("\n");
    }
    return sb.toString();
}


public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    PorteMonnaie other = (PorteMonnaie) obj;
    HashMap<String, Integer> otherContenu = other.getContenu();
    if (contenu.size() != otherContenu.size()) {
        return false;
    }
    for (String unite : contenu.keySet()) {
        if (!otherContenu.containsKey(unite) || !contenu.get(unite).equals(otherContenu.get(unite))) {
            return false;
        }
    }
    return true;
}



}