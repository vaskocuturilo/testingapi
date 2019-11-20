package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class All.
 */
@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal", "PMD.ShortVariable", "PMD.LongVariable", "PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class All {

    /**
     * The private value.
     */
    @JsonProperty("piercings")
    private int piercings;

    /**
     * The private value.
     */
    @JsonProperty("avg_damage_assisted_radio")
    private double avgDamageAssistedRadio;

    /**
     * The private value.
     */
    @JsonProperty("damage_dealt")
    private int damageDealt;

    /**
     * The private value.
     */
    @JsonProperty("tanking_factor")
    private double tankingFactor;

    /**
     * The private value.
     */
    @JsonProperty("stun_assisted_damage")
    private int stunAssistedDamage;

    /**
     * The private value.
     */
    @JsonProperty("battles_on_stunning_vehicles")
    private int battlesOnStunningVehicles;

    /**
     * The private value.
     */
    @JsonProperty("dropped_capture_points")
    private int droppedCapturePoints;

    /**
     * The private value.
     */
    @JsonProperty("losses")
    private int losses;

    /**
     * The private value.
     */
    @JsonProperty("spotted")
    private int spotted;

    /**
     * The private value.
     */
    @JsonProperty("avg_damage_assisted")
    private double avgDamageAssisted;

    /**
     * The private value.
     */
    @JsonProperty("no_damage_direct_hits_received")
    private int noDamageDirectHitsReceived;

    /**
     * The private value.
     */
    @JsonProperty("frags")
    private int frags;

    /**
     * The private value.
     */
    @JsonProperty("explosion_hits_received")
    private int explosionHitsReceived;

    /**
     * The private value.
     */
    @JsonProperty("battle_avg_xp")
    private int battleAvgXp;

    /**
     * The private value.
     */
    @JsonProperty("draws")
    private int draws;

    /**
     * The private value.
     */
    @JsonProperty("max_frags_tank_id")
    private int maxFragsTankId;

    /**
     * The private value.
     */
    @JsonProperty("wins")
    private int wins;

    /**
     * The private value.
     */
    @JsonProperty("survived_battles")
    private int survivedBattles;

    /**
     * The private value.
     */
    @JsonProperty("explosion_hits")
    private int explosionHits;

    /**
     * The private value.
     */
    @JsonProperty("hits")
    private int hits;

    /**
     * The private value.
     */
    @JsonProperty("hits_percents")
    private int hitsPercents;

    /**
     * The private value.
     */
    @JsonProperty("max_damage_tank_id")
    private int maxDamageTankId;

    /**
     * The private value.
     */
    @JsonProperty("max_damage")
    private int maxDamage;

    /**
     * The private value.
     */
    @JsonProperty("direct_hits_received")
    private int directHitsReceived;

    /**
     * The private value.
     */
    @JsonProperty("max_frags")
    private int maxFrags;

    /**
     * The private value.
     */
    @JsonProperty("damage_received")
    private int damageReceived;

    /**
     * The private value.
     */
    @JsonProperty("xp")
    private int xp;

    /**
     * The private value.
     */
    @JsonProperty("piercings_received")
    private int piercingsReceived;

    /**
     * The private value.
     */
    @JsonProperty("max_xp_tank_id")
    private int maxXpTankId;

    /**
     * The private value.
     */
    @JsonProperty("battles")
    private int battles;

    /**
     * The private value.
     */
    @JsonProperty("stun_number")
    private int stunNumber;

    /**
     * The private value.
     */
    @JsonProperty("max_xp")
    private int maxXp;

    /**
     * The private value.
     */
    @JsonProperty("capture_points")
    private int capturePoints;

    /**
     * The private value.
     */
    @JsonProperty("shots")
    private int shots;

    /**
     * The private value.
     */
    @JsonProperty("avg_damage_blocked")
    private double avgDamageBlocked;

    /**
     * The private value.
     */
    @JsonProperty("avg_damage_assisted_track")
    private double avgDamageAssistedTrack;

    /**
     * Sets piercings.
     *
     * @param piercings the piercings
     */
    public void setPiercings(final int piercings) {
        this.piercings = piercings;
    }

    /**
     * Gets piercings.
     *
     * @return the piercings
     */
    public int getPiercings() {
        return piercings;
    }

    /**
     * Sets avg damage assisted radio.
     *
     * @param avgDamageAssistedRadio the avg damage assisted radio
     */
    public void setAvgDamageAssistedRadio(double avgDamageAssistedRadio) {
        this.avgDamageAssistedRadio = avgDamageAssistedRadio;
    }

    /**
     * Gets avg damage assisted radio.
     *
     * @return the avg damage assisted radio
     */
    public double getAvgDamageAssistedRadio() {
        return avgDamageAssistedRadio;
    }

    /**
     * Sets damage dealt.
     *
     * @param damageDealt the damage dealt
     */
    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    /**
     * Gets damage dealt.
     *
     * @return the damage dealt
     */
    public int getDamageDealt() {
        return damageDealt;
    }

    /**
     * Sets tanking factor.
     *
     * @param tankingFactor the tanking factor
     */
    public void setTankingFactor(double tankingFactor) {
        this.tankingFactor = tankingFactor;
    }

    /**
     * Gets tanking factor.
     *
     * @return the tanking factor
     */
    public double getTankingFactor() {
        return tankingFactor;
    }

    /**
     * Sets stun assisted damage.
     *
     * @param stunAssistedDamage the stun assisted damage
     */
    public void setStunAssistedDamage(int stunAssistedDamage) {
        this.stunAssistedDamage = stunAssistedDamage;
    }

    /**
     * Gets stun assisted damage.
     *
     * @return the stun assisted damage
     */
    public int getStunAssistedDamage() {
        return stunAssistedDamage;
    }

    /**
     * Sets battles on stunning vehicles.
     *
     * @param battlesOnStunningVehicles the battles on stunning vehicles
     */
    public void setBattlesOnStunningVehicles(int battlesOnStunningVehicles) {
        this.battlesOnStunningVehicles = battlesOnStunningVehicles;
    }

    /**
     * Gets battles on stunning vehicles.
     *
     * @return the battles on stunning vehicles
     */
    public int getBattlesOnStunningVehicles() {
        return battlesOnStunningVehicles;
    }

    /**
     * Sets dropped capture points.
     *
     * @param droppedCapturePoints the dropped capture points
     */
    public void setDroppedCapturePoints(int droppedCapturePoints) {
        this.droppedCapturePoints = droppedCapturePoints;
    }

    /**
     * Gets dropped capture points.
     *
     * @return the dropped capture points
     */
    public int getDroppedCapturePoints() {
        return droppedCapturePoints;
    }

    /**
     * Sets losses.
     *
     * @param losses the losses
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * Gets losses.
     *
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets spotted.
     *
     * @param spotted the spotted
     */
    public void setSpotted(int spotted) {
        this.spotted = spotted;
    }

    /**
     * Gets spotted.
     *
     * @return the spotted
     */
    public int getSpotted() {
        return spotted;
    }

    /**
     * Sets avg damage assisted.
     *
     * @param avgDamageAssisted the avg damage assisted
     */
    public void setAvgDamageAssisted(double avgDamageAssisted) {
        this.avgDamageAssisted = avgDamageAssisted;
    }

    /**
     * Gets avg damage assisted.
     *
     * @return the avg damage assisted
     */
    public double getAvgDamageAssisted() {
        return avgDamageAssisted;
    }

    /**
     * Sets no damage direct hits received.
     *
     * @param noDamageDirectHitsReceived the no damage direct hits received
     */
    public void setNoDamageDirectHitsReceived(int noDamageDirectHitsReceived) {
        this.noDamageDirectHitsReceived = noDamageDirectHitsReceived;
    }

    /**
     * Gets no damage direct hits received.
     *
     * @return the no damage direct hits received
     */
    public int getNoDamageDirectHitsReceived() {
        return noDamageDirectHitsReceived;
    }

    /**
     * Sets frags.
     *
     * @param frags the frags
     */
    public void setFrags(int frags) {
        this.frags = frags;
    }

    /**
     * Gets frags.
     *
     * @return the frags
     */
    public int getFrags() {
        return frags;
    }

    /**
     * Sets explosion hits received.
     *
     * @param explosionHitsReceived the explosion hits received
     */
    public void setExplosionHitsReceived(int explosionHitsReceived) {
        this.explosionHitsReceived = explosionHitsReceived;
    }

    /**
     * Gets explosion hits received.
     *
     * @return the explosion hits received
     */
    public int getExplosionHitsReceived() {
        return explosionHitsReceived;
    }

    /**
     * Sets battle avg xp.
     *
     * @param battleAvgXp the battle avg xp
     */
    public void setBattleAvgXp(int battleAvgXp) {
        this.battleAvgXp = battleAvgXp;
    }

    /**
     * Gets battle avg xp.
     *
     * @return the battle avg xp
     */
    public int getBattleAvgXp() {
        return battleAvgXp;
    }

    /**
     * Sets draws.
     *
     * @param draws the draws
     */
    public void setDraws(int draws) {
        this.draws = draws;
    }

    /**
     * Gets draws.
     *
     * @return the draws
     */
    public int getDraws() {
        return draws;
    }

    /**
     * Sets max frags tank id.
     *
     * @param maxFragsTankId the max frags tank id
     */
    public void setMaxFragsTankId(int maxFragsTankId) {
        this.maxFragsTankId = maxFragsTankId;
    }

    /**
     * Gets max frags tank id.
     *
     * @return the max frags tank id
     */
    public int getMaxFragsTankId() {
        return maxFragsTankId;
    }

    /**
     * Sets wins.
     *
     * @param wins the wins
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Gets wins.
     *
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets survived battles.
     *
     * @param survivedBattles the survived battles
     */
    public void setSurvivedBattles(int survivedBattles) {
        this.survivedBattles = survivedBattles;
    }

    /**
     * Gets survived battles.
     *
     * @return the survived battles
     */
    public int getSurvivedBattles() {
        return survivedBattles;
    }

    /**
     * Sets explosion hits.
     *
     * @param explosionHits the explosion hits
     */
    public void setExplosionHits(int explosionHits) {
        this.explosionHits = explosionHits;
    }

    /**
     * Gets explosion hits.
     *
     * @return the explosion hits
     */
    public int getExplosionHits() {
        return explosionHits;
    }

    /**
     * Sets hits.
     *
     * @param hits the hits
     */
    public void setHits(int hits) {
        this.hits = hits;
    }

    /**
     * Gets hits.
     *
     * @return the hits
     */
    public int getHits() {
        return hits;
    }

    /**
     * Sets hits percents.
     *
     * @param hitsPercents the hits percents
     */
    public void setHitsPercents(int hitsPercents) {
        this.hitsPercents = hitsPercents;
    }

    /**
     * Gets hits percents.
     *
     * @return the hits percents
     */
    public int getHitsPercents() {
        return hitsPercents;
    }

    /**
     * Sets max damage tank id.
     *
     * @param maxDamageTankId the max damage tank id
     */
    public void setMaxDamageTankId(int maxDamageTankId) {
        this.maxDamageTankId = maxDamageTankId;
    }

    /**
     * Gets max damage tank id.
     *
     * @return the max damage tank id
     */
    public int getMaxDamageTankId() {
        return maxDamageTankId;
    }

    /**
     * Sets max damage.
     *
     * @param maxDamage the max damage
     */
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    /**
     * Gets max damage.
     *
     * @return the max damage
     */
    public int getMaxDamage() {
        return maxDamage;
    }

    /**
     * Sets direct hits received.
     *
     * @param directHitsReceived the direct hits received
     */
    public void setDirectHitsReceived(int directHitsReceived) {
        this.directHitsReceived = directHitsReceived;
    }

    /**
     * Gets direct hits received.
     *
     * @return the direct hits received
     */
    public int getDirectHitsReceived() {
        return directHitsReceived;
    }

    /**
     * Sets max frags.
     *
     * @param maxFrags the max frags
     */
    public void setMaxFrags(int maxFrags) {
        this.maxFrags = maxFrags;
    }

    /**
     * Gets max frags.
     *
     * @return the max frags
     */
    public int getMaxFrags() {
        return maxFrags;
    }

    /**
     * Sets damage received.
     *
     * @param damageReceived the damage received
     */
    public void setDamageReceived(int damageReceived) {
        this.damageReceived = damageReceived;
    }

    /**
     * Gets damage received.
     *
     * @return the damage received
     */
    public int getDamageReceived() {
        return damageReceived;
    }

    /**
     * Sets xp.
     *
     * @param xp the xp
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Gets xp.
     *
     * @return the xp
     */
    public int getXp() {
        return xp;
    }

    /**
     * Sets piercings received.
     *
     * @param piercingsReceived the piercings received
     */
    public void setPiercingsReceived(int piercingsReceived) {
        this.piercingsReceived = piercingsReceived;
    }

    /**
     * Gets piercings received.
     *
     * @return the piercings received
     */
    public int getPiercingsReceived() {
        return piercingsReceived;
    }

    /**
     * Sets max xp tank id.
     *
     * @param maxXpTankId the max xp tank id
     */
    public void setMaxXpTankId(int maxXpTankId) {
        this.maxXpTankId = maxXpTankId;
    }

    /**
     * Gets max xp tank id.
     *
     * @return the max xp tank id
     */
    public int getMaxXpTankId() {
        return maxXpTankId;
    }

    /**
     * Sets battles.
     *
     * @param battles the battles
     */
    public void setBattles(int battles) {
        this.battles = battles;
    }

    /**
     * Gets battles.
     *
     * @return the battles
     */
    public int getBattles() {
        return battles;
    }

    /**
     * Sets stun number.
     *
     * @param stunNumber the stun number
     */
    public void setStunNumber(int stunNumber) {
        this.stunNumber = stunNumber;
    }

    /**
     * Gets stun number.
     *
     * @return the stun number
     */
    public int getStunNumber() {
        return stunNumber;
    }

    /**
     * Sets max xp.
     *
     * @param maxXp the max xp
     */
    public void setMaxXp(int maxXp) {
        this.maxXp = maxXp;
    }

    /**
     * Gets max xp.
     *
     * @return the max xp
     */
    public int getMaxXp() {
        return maxXp;
    }

    /**
     * Sets capture points.
     *
     * @param capturePoints the capture points
     */
    public void setCapturePoints(int capturePoints) {
        this.capturePoints = capturePoints;
    }

    /**
     * Gets capture points.
     *
     * @return the capture points
     */
    public int getCapturePoints() {
        return capturePoints;
    }

    /**
     * Sets shots.
     *
     * @param shots the shots
     */
    public void setShots(int shots) {
        this.shots = shots;
    }

    /**
     * Gets shots.
     *
     * @return the shots
     */
    public int getShots() {
        return shots;
    }

    /**
     * Sets avg damage blocked.
     *
     * @param avgDamageBlocked the avg damage blocked
     */
    public void setAvgDamageBlocked(double avgDamageBlocked) {
        this.avgDamageBlocked = avgDamageBlocked;
    }

    /**
     * Gets avg damage blocked.
     *
     * @return the avg damage blocked
     */
    public double getAvgDamageBlocked() {
        return avgDamageBlocked;
    }

    /**
     * Sets avg damage assisted track.
     *
     * @param avgDamageAssistedTrack the avg damage assisted track
     */
    public void setAvgDamageAssistedTrack(double avgDamageAssistedTrack) {
        this.avgDamageAssistedTrack = avgDamageAssistedTrack;
    }

    /**
     * Gets avg damage assisted track.
     *
     * @return the avg damage assisted track
     */
    public double getAvgDamageAssistedTrack() {
        return avgDamageAssistedTrack;
    }

    @Override
    public String toString() {
        return
                "All{" +
                        "piercings = '" + piercings + '\'' +
                        ",avg_damage_assisted_radio = '" + avgDamageAssistedRadio + '\'' +
                        ",damage_dealt = '" + damageDealt + '\'' +
                        ",tanking_factor = '" + tankingFactor + '\'' +
                        ",stun_assisted_damage = '" + stunAssistedDamage + '\'' +
                        ",battles_on_stunning_vehicles = '" + battlesOnStunningVehicles + '\'' +
                        ",dropped_capture_points = '" + droppedCapturePoints + '\'' +
                        ",losses = '" + losses + '\'' +
                        ",spotted = '" + spotted + '\'' +
                        ",avg_damage_assisted = '" + avgDamageAssisted + '\'' +
                        ",no_damage_direct_hits_received = '" + noDamageDirectHitsReceived + '\'' +
                        ",frags = '" + frags + '\'' +
                        ",explosion_hits_received = '" + explosionHitsReceived + '\'' +
                        ",battle_avg_xp = '" + battleAvgXp + '\'' +
                        ",draws = '" + draws + '\'' +
                        ",max_frags_tank_id = '" + maxFragsTankId + '\'' +
                        ",wins = '" + wins + '\'' +
                        ",survived_battles = '" + survivedBattles + '\'' +
                        ",explosion_hits = '" + explosionHits + '\'' +
                        ",hits = '" + hits + '\'' +
                        ",hits_percents = '" + hitsPercents + '\'' +
                        ",max_damage_tank_id = '" + maxDamageTankId + '\'' +
                        ",max_damage = '" + maxDamage + '\'' +
                        ",direct_hits_received = '" + directHitsReceived + '\'' +
                        ",max_frags = '" + maxFrags + '\'' +
                        ",damage_received = '" + damageReceived + '\'' +
                        ",xp = '" + xp + '\'' +
                        ",piercings_received = '" + piercingsReceived + '\'' +
                        ",max_xp_tank_id = '" + maxXpTankId + '\'' +
                        ",battles = '" + battles + '\'' +
                        ",stun_number = '" + stunNumber + '\'' +
                        ",max_xp = '" + maxXp + '\'' +
                        ",capture_points = '" + capturePoints + '\'' +
                        ",shots = '" + shots + '\'' +
                        ",avg_damage_blocked = '" + avgDamageBlocked + '\'' +
                        ",avg_damage_assisted_track = '" + avgDamageAssistedTrack + '\'' +
                        "}";
    }
}