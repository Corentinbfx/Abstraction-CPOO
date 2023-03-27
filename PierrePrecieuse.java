/**
 * @overview Une PierrePrecieuse représente un type de pierre rare, repris dans une classification officielle.
 * PierrePrecieuse est immutable.
 *
 * Une PierrePrecieuse typique est <nom, type, classification> où
 * @specfield nom: String - Le nom de la pierre précieuse
 * @specfield type: String - Le type de pierre précieuse
 * @specfield classification: String - Niveau de qualité de la pierre précieuse
 *
 * Exemple: PierrePrecieuse <"Saphir Cachemire", "Saphir", "A">
 *
 * @invariant type in (Diamant, Emeraude, Rubis, Saphir)
 * @invariant classification in (A, AA, AAA)
 */
public class PierrePrecieuse {
    private String nomPierre;
    private String typePierre;
    private String ranking;

    /**
     * @requires typePierre IN (Diamant, Emeraude, Rubis, Saphir)
     * @requires ranking IN (A, AA, AAA)
     * @effects this_post.nom = nom &&
     *          this_post.type = typePierre &&
     *          this_post.classification = ranking
     */
    public PierrePrecieuse(String nom, String typePierre, String ranking) {
        this.nomPierre = nom;
        this.typePierre = typePierre;
        this.ranking = ranking;
    }

    /**
     * @return this.nom
     */
    public String getNom() { return this.nomPierre; }

    /**
     * @return this.type
     */
    public String getType() { return this.typePierre; }

    /**
     * @return this.classification
     */
    public String getClassfication() { return this.ranking; }

    @Override
    public String toString() {
        return "PierrePrecieuse: { nom: " + this.nomPierre + ", type: " + this.typePierre + ", classification: " + this.getClassfication() + " }";
    }
}
