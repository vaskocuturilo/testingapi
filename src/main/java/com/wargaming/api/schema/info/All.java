package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal", "PMD.ShortVariable", "PMD.LongVariable", "PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class All {

    @JsonProperty("piercings")
    private int piercings;

    @JsonProperty("avg_damage_assisted_radio")
    private double avgDamageAssistedRadio;

    @JsonProperty("damage_dealt")
    private int damageDealt;

    @JsonProperty("tanking_factor")
    private double tankingFactor;

    @JsonProperty("stun_assisted_damage")
    private int stunAssistedDamage;

    @JsonProperty("battles_on_stunning_vehicles")
    private int battlesOnStunningVehicles;

    @JsonProperty("dropped_capture_points")
    private int droppedCapturePoints;

    @JsonProperty("losses")
    private int losses;

    @JsonProperty("spotted")
    private int spotted;

    @JsonProperty("avg_damage_assisted")
    private double avgDamageAssisted;

    @JsonProperty("no_damage_direct_hits_received")
    private int noDamageDirectHitsReceived;

    @JsonProperty("frags")
    private int frags;

    @JsonProperty("explosion_hits_received")
    private int explosionHitsReceived;

    @JsonProperty("battle_avg_xp")
    private int battleAvgXp;

    @JsonProperty("draws")
    private int draws;

    @JsonProperty("max_frags_tank_id")
    private int maxFragsTankId;

    @JsonProperty("wins")
    private int wins;

    @JsonProperty("survived_battles")
    private int survivedBattles;

    @JsonProperty("explosion_hits")
    private int explosionHits;

    @JsonProperty("hits")
    private int hits;

    @JsonProperty("hits_percents")
    private int hitsPercents;

    @JsonProperty("max_damage_tank_id")
    private int maxDamageTankId;

    @JsonProperty("max_damage")
    private int maxDamage;

    @JsonProperty("direct_hits_received")
    private int directHitsReceived;

    @JsonProperty("max_frags")
    private int maxFrags;

    @JsonProperty("damage_received")
    private int damageReceived;

    @JsonProperty("xp")
    private int xp;

    @JsonProperty("piercings_received")
    private int piercingsReceived;

    @JsonProperty("max_xp_tank_id")
    private int maxXpTankId;

    @JsonProperty("battles")
    private int battles;

    @JsonProperty("stun_number")
    private int stunNumber;

    @JsonProperty("max_xp")
    private int maxXp;

    @JsonProperty("capture_points")
    private int capturePoints;

    @JsonProperty("shots")
    private int shots;

    @JsonProperty("avg_damage_blocked")
    private double avgDamageBlocked;

    @JsonProperty("avg_damage_assisted_track")
    private double avgDamageAssistedTrack;

    public void setPiercings(int piercings) {
        this.piercings = piercings;
    }

    public int getPiercings() {
        return piercings;
    }

    public void setAvgDamageAssistedRadio(double avgDamageAssistedRadio) {
        this.avgDamageAssistedRadio = avgDamageAssistedRadio;
    }

    public double getAvgDamageAssistedRadio() {
        return avgDamageAssistedRadio;
    }

    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public void setTankingFactor(double tankingFactor) {
        this.tankingFactor = tankingFactor;
    }

    public double getTankingFactor() {
        return tankingFactor;
    }

    public void setStunAssistedDamage(int stunAssistedDamage) {
        this.stunAssistedDamage = stunAssistedDamage;
    }

    public int getStunAssistedDamage() {
        return stunAssistedDamage;
    }

    public void setBattlesOnStunningVehicles(int battlesOnStunningVehicles) {
        this.battlesOnStunningVehicles = battlesOnStunningVehicles;
    }

    public int getBattlesOnStunningVehicles() {
        return battlesOnStunningVehicles;
    }

    public void setDroppedCapturePoints(int droppedCapturePoints) {
        this.droppedCapturePoints = droppedCapturePoints;
    }

    public int getDroppedCapturePoints() {
        return droppedCapturePoints;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getLosses() {
        return losses;
    }

    public void setSpotted(int spotted) {
        this.spotted = spotted;
    }

    public int getSpotted() {
        return spotted;
    }

    public void setAvgDamageAssisted(double avgDamageAssisted) {
        this.avgDamageAssisted = avgDamageAssisted;
    }

    public double getAvgDamageAssisted() {
        return avgDamageAssisted;
    }

    public void setNoDamageDirectHitsReceived(int noDamageDirectHitsReceived) {
        this.noDamageDirectHitsReceived = noDamageDirectHitsReceived;
    }

    public int getNoDamageDirectHitsReceived() {
        return noDamageDirectHitsReceived;
    }

    public void setFrags(int frags) {
        this.frags = frags;
    }

    public int getFrags() {
        return frags;
    }

    public void setExplosionHitsReceived(int explosionHitsReceived) {
        this.explosionHitsReceived = explosionHitsReceived;
    }

    public int getExplosionHitsReceived() {
        return explosionHitsReceived;
    }

    public void setBattleAvgXp(int battleAvgXp) {
        this.battleAvgXp = battleAvgXp;
    }

    public int getBattleAvgXp() {
        return battleAvgXp;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDraws() {
        return draws;
    }

    public void setMaxFragsTankId(int maxFragsTankId) {
        this.maxFragsTankId = maxFragsTankId;
    }

    public int getMaxFragsTankId() {
        return maxFragsTankId;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public void setSurvivedBattles(int survivedBattles) {
        this.survivedBattles = survivedBattles;
    }

    public int getSurvivedBattles() {
        return survivedBattles;
    }

    public void setExplosionHits(int explosionHits) {
        this.explosionHits = explosionHits;
    }

    public int getExplosionHits() {
        return explosionHits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHits() {
        return hits;
    }

    public void setHitsPercents(int hitsPercents) {
        this.hitsPercents = hitsPercents;
    }

    public int getHitsPercents() {
        return hitsPercents;
    }

    public void setMaxDamageTankId(int maxDamageTankId) {
        this.maxDamageTankId = maxDamageTankId;
    }

    public int getMaxDamageTankId() {
        return maxDamageTankId;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setDirectHitsReceived(int directHitsReceived) {
        this.directHitsReceived = directHitsReceived;
    }

    public int getDirectHitsReceived() {
        return directHitsReceived;
    }

    public void setMaxFrags(int maxFrags) {
        this.maxFrags = maxFrags;
    }

    public int getMaxFrags() {
        return maxFrags;
    }

    public void setDamageReceived(int damageReceived) {
        this.damageReceived = damageReceived;
    }

    public int getDamageReceived() {
        return damageReceived;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }

    public void setPiercingsReceived(int piercingsReceived) {
        this.piercingsReceived = piercingsReceived;
    }

    public int getPiercingsReceived() {
        return piercingsReceived;
    }

    public void setMaxXpTankId(int maxXpTankId) {
        this.maxXpTankId = maxXpTankId;
    }

    public int getMaxXpTankId() {
        return maxXpTankId;
    }

    public void setBattles(int battles) {
        this.battles = battles;
    }

    public int getBattles() {
        return battles;
    }

    public void setStunNumber(int stunNumber) {
        this.stunNumber = stunNumber;
    }

    public int getStunNumber() {
        return stunNumber;
    }

    public void setMaxXp(int maxXp) {
        this.maxXp = maxXp;
    }

    public int getMaxXp() {
        return maxXp;
    }

    public void setCapturePoints(int capturePoints) {
        this.capturePoints = capturePoints;
    }

    public int getCapturePoints() {
        return capturePoints;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getShots() {
        return shots;
    }

    public void setAvgDamageBlocked(double avgDamageBlocked) {
        this.avgDamageBlocked = avgDamageBlocked;
    }

    public double getAvgDamageBlocked() {
        return avgDamageBlocked;
    }

    public void setAvgDamageAssistedTrack(double avgDamageAssistedTrack) {
        this.avgDamageAssistedTrack = avgDamageAssistedTrack;
    }

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