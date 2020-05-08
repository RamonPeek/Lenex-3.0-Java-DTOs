package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class Meet {

    private List<Session> sessions;
    private List<Club> clubs;
    private AgeDate ageDate;
    private int altitude;
    private String city;
    private String cityEn;
    private Contact contact;
    private CourseCode course;
    private Date deadline;
    private Time deadlineTime;
    private LocalDateTime entryStartDate;
    private EntryType entryType;
    private Facility facility;
    private List<Fee> fees;
    private String hostClub;
    private String hostClubUrl;
    private int maxEntriesAthlete;
    private int maxEntriesRelay;
    private String name;
    private String nameEn;
    private Nation nation;
    private String number;
    private String organizer;
    private String organizerUrl;
    private PointTable pointTable;
    private Pool pool;
    private Qualify qualify;
    private int reserveCount;
    private String resultUrl;
    private StartMethod startMethod;
    private String state;
    private int swrid;
    private Timing timing;
    private MeetType type;
    private LocalDateTime withdrawUntil;

    public Meet() {
    }

    public Meet(List<Session> sessions, List<Club> clubs, AgeDate ageDate, int altitude, String city, String cityEn, Contact contact, CourseCode course, Date deadline, Time deadlineTime, LocalDateTime entryStartDate, EntryType entryType, Facility facility, List<Fee> fees, String hostClub, String hostClubUrl, int maxEntriesAthlete, int maxEntriesRelay, String name, String nameEn, Nation nation, String number, String organizer, String organizerUrl, PointTable pointTable, Pool pool, Qualify qualify, int reserveCount, String resultUrl, StartMethod startMethod, String state, int swrid, Timing timing, MeetType type, LocalDateTime withdrawUntil) {
        this.sessions = sessions;
        this.clubs = clubs;
        this.ageDate = ageDate;
        this.altitude = altitude;
        this.city = city;
        this.cityEn = cityEn;
        this.contact = contact;
        this.course = course;
        this.deadline = deadline;
        this.deadlineTime = deadlineTime;
        this.entryStartDate = entryStartDate;
        this.entryType = entryType;
        this.facility = facility;
        this.fees = fees;
        this.hostClub = hostClub;
        this.hostClubUrl = hostClubUrl;
        this.maxEntriesAthlete = maxEntriesAthlete;
        this.maxEntriesRelay = maxEntriesRelay;
        this.name = name;
        this.nameEn = nameEn;
        this.nation = nation;
        this.number = number;
        this.organizer = organizer;
        this.organizerUrl = organizerUrl;
        this.pointTable = pointTable;
        this.pool = pool;
        this.qualify = qualify;
        this.reserveCount = reserveCount;
        this.resultUrl = resultUrl;
        this.startMethod = startMethod;
        this.state = state;
        this.swrid = swrid;
        this.timing = timing;
        this.type = type;
        this.withdrawUntil = withdrawUntil;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public AgeDate getAgeDate() {
        return ageDate;
    }

    public void setAgeDate(AgeDate ageDate) {
        this.ageDate = ageDate;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public CourseCode getCourse() {
        return course;
    }

    public void setCourse(CourseCode course) {
        this.course = course;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Time getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Time deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public LocalDateTime getEntryStartDate() {
        return entryStartDate;
    }

    public void setEntryStartDate(LocalDateTime entryStartDate) {
        this.entryStartDate = entryStartDate;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public String getHostClub() {
        return hostClub;
    }

    public void setHostClub(String hostClub) {
        this.hostClub = hostClub;
    }

    public String getHostClubUrl() {
        return hostClubUrl;
    }

    public void setHostClubUrl(String hostClubUrl) {
        this.hostClubUrl = hostClubUrl;
    }

    public int getMaxEntriesAthlete() {
        return maxEntriesAthlete;
    }

    public void setMaxEntriesAthlete(int maxEntriesAthlete) {
        this.maxEntriesAthlete = maxEntriesAthlete;
    }

    public int getMaxEntriesRelay() {
        return maxEntriesRelay;
    }

    public void setMaxEntriesRelay(int maxEntriesRelay) {
        this.maxEntriesRelay = maxEntriesRelay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getOrganizerUrl() {
        return organizerUrl;
    }

    public void setOrganizerUrl(String organizerUrl) {
        this.organizerUrl = organizerUrl;
    }

    public PointTable getPointTable() {
        return pointTable;
    }

    public void setPointTable(PointTable pointTable) {
        this.pointTable = pointTable;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public Qualify getQualify() {
        return qualify;
    }

    public void setQualify(Qualify qualify) {
        this.qualify = qualify;
    }

    public int getReserveCount() {
        return reserveCount;
    }

    public void setReserveCount(int reserveCount) {
        this.reserveCount = reserveCount;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public StartMethod getStartMethod() {
        return startMethod;
    }

    public void setStartMethod(StartMethod startMethod) {
        this.startMethod = startMethod;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSwrid() {
        return swrid;
    }

    public void setSwrid(int swrid) {
        this.swrid = swrid;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public MeetType getType() {
        return type;
    }

    public void setType(MeetType type) {
        this.type = type;
    }

    public LocalDateTime getWithdrawUntil() {
        return withdrawUntil;
    }

    public void setWithdrawUntil(LocalDateTime withdrawUntil) {
        this.withdrawUntil = withdrawUntil;
    }
}
