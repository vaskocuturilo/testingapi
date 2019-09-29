package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal", "PMD.ShortVariable", "PMD.LongVariable", "PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class Statistics {

    @JsonProperty("all")
    private All all;

    @JsonProperty("trees_cut")
    private int treesCut;

    @JsonProperty("frags")
    private Object frags;

    @JsonProperty("clan")
    private Clan clan;

    @JsonProperty("stronghold_defense")
    private StrongholdDefense strongholdDefense;

    @JsonProperty("historical")
    private Historical historical;

    @JsonProperty("company")
    private Company company;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("stronghold_skirmish")
    private StrongholdSkirmish strongholdSkirmish;

    @JsonProperty("regular_team")
    private RegularTeam regularTeam;

    public void setAll(All all) {
        this.all = all;
    }

    public All getAll() {
        return all;
    }

    public void setTreesCut(int treesCut) {
        this.treesCut = treesCut;
    }

    public int getTreesCut() {
        return treesCut;
    }

    public void setFrags(Object frags) {
        this.frags = frags;
    }

    public Object getFrags() {
        return frags;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Clan getClan() {
        return clan;
    }

    public void setStrongholdDefense(StrongholdDefense strongholdDefense) {
        this.strongholdDefense = strongholdDefense;
    }

    public StrongholdDefense getStrongholdDefense() {
        return strongholdDefense;
    }

    public void setHistorical(Historical historical) {
        this.historical = historical;
    }

    public Historical getHistorical() {
        return historical;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setStrongholdSkirmish(StrongholdSkirmish strongholdSkirmish) {
        this.strongholdSkirmish = strongholdSkirmish;
    }

    public StrongholdSkirmish getStrongholdSkirmish() {
        return strongholdSkirmish;
    }

    public void setRegularTeam(RegularTeam regularTeam) {
        this.regularTeam = regularTeam;
    }

    public RegularTeam getRegularTeam() {
        return regularTeam;
    }

    @Override
    public String toString() {
        return
                "Statistics{" +
                        "all = '" + all + '\'' +
                        ",trees_cut = '" + treesCut + '\'' +
                        ",frags = '" + frags + '\'' +
                        ",clan = '" + clan + '\'' +
                        ",stronghold_defense = '" + strongholdDefense + '\'' +
                        ",historical = '" + historical + '\'' +
                        ",company = '" + company + '\'' +
                        ",team = '" + team + '\'' +
                        ",stronghold_skirmish = '" + strongholdSkirmish + '\'' +
                        ",regular_team = '" + regularTeam + '\'' +
                        "}";
    }
}