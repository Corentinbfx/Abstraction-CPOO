import java.util.ArrayList;

/**
 * @overview une CollectionPierres représente une collection de PierrePrecieuses pouvant contenir des doublons.
 * CollectionPierres est mutable.
 *
 * Une CollectionPierres typique est <pierres, taille> où
 * @specfield pierres: ensemble - Ensemble des PierrePrecieuses de la collection
 * @derivedfield taille: entier - Nombre de pierres dans la collection
 *
 * @invariant taille = #pierres
 */
public class CollectionPierres {
    private ArrayList<PierrePrecieuse> elems;

    /**
     * @effects this_post.pierres = {}
     */
    public CollectionPierres() {
        this.elems = new ArrayList<>();
    }

    /**
     * @modifies this.pierres
     * @effects this_post.pierres = this.pierres U { p }
     */
    public void addPierre(PierrePrecieuse p) {
        this.elems.add(p);
    }

    /**
     * @modifies this.pierres
     * @effects this_post.pierres = this.pierres \ { p }
     */
    public void removePierre(PierrePrecieuse p) {
        while(this.elems.remove(p)) {}
    }

    /**
     * @return this.taille
     */
    public int nbPierres() { return this.elems.size(); }
}
