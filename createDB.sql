use journaldb;
-- Table: groups
CREATE TABLE groups (
    id int NOT NULL,
    name varchar(20) NOT NULL,
    CONSTRAINT groups_pk PRIMARY KEY (id)
);

-- Table: marks
CREATE TABLE marks (
    id int NOT NULL,
    mark int NOT NULL,
    date date NOT NULL,
    pupilId int NOT NULL,
    subjectId int NOT NULL,
    CONSTRAINT marks_pk PRIMARY KEY (id)
);

-- Table: pupils
CREATE TABLE pupils (
    id int NOT NULL,
    login varchar(30) DEFAULT NULL,
    password varchar(100) DEFAULT NULL,
    lastName varchar(30) NOT NULL,
    firstName varchar(30) NOT NULL,
    fatherName varchar(30) NOT NULL,
    gender int NOT NULL,
    birth date NOT NULL,
    mail varchar(50) NOT NULL,
    phone varchar(15) DEFAULT NULL,
    address varchar(100) DEFAULT NULL,
    groupId int DEFAULT NULL,
    CONSTRAINT pupils_pk PRIMARY KEY (id)
);

-- Table: subjectTeach
CREATE TABLE subjectTeach (
    id int NOT NULL,
    subjectId int NOT NULL,
    teacherId int NOT NULL,
    groupId int NOT NULL,
    CONSTRAINT subjectTeach_pk PRIMARY KEY (id)
);

-- Table: subjects
CREATE TABLE subjects (
    id int NOT NULL,
    title varchar(30) NOT NULL,
    CONSTRAINT subjects_pk PRIMARY KEY (id)
);

-- Table: teachers
CREATE TABLE teachers (
    id int NOT NULL,
    login varchar(30) DEFAULT NULL,
    password varchar(100) DEFAULT NULL,
    lastName varchar(30) NOT NULL,
    firstName varchar(30) NOT NULL,
    fatherName varchar(30) NOT NULL,
    gender int NOT NULL,
    birth date NOT NULL,
    mail varchar(50) NOT NULL,
    phone varchar(15) DEFAULT NULL,
    address varchar(100) DEFAULT NULL,
    CONSTRAINT teachers_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: marks_pupils (table: marks)
ALTER TABLE marks ADD CONSTRAINT marks_pupils FOREIGN KEY marks_pupils (pupilId)
    REFERENCES pupils (id);

-- Reference: marks_subjects (table: marks)
ALTER TABLE marks ADD CONSTRAINT marks_subjects FOREIGN KEY marks_subjects (subjectId)
    REFERENCES subjects (id);

-- Reference: pupils_groups (table: pupils)
ALTER TABLE pupils ADD CONSTRAINT pupils_groups FOREIGN KEY pupils_groups (groupId)
    REFERENCES groups (id);

-- Reference: subjectTeach_groups (table: subjectTeach)
ALTER TABLE subjectTeach ADD CONSTRAINT subjectTeach_groups FOREIGN KEY subjectTeach_groups (groupId)
    REFERENCES groups (id);

-- Reference: subjectTeach_subjects (table: subjectTeach)
ALTER TABLE subjectTeach ADD CONSTRAINT subjectTeach_subjects FOREIGN KEY subjectTeach_subjects (subjectId)
    REFERENCES subjects (id);

-- Reference: subjectTeach_teachers (table: subjectTeach)
ALTER TABLE subjectTeach ADD CONSTRAINT subjectTeach_teachers FOREIGN KEY subjectTeach_teachers (teacherId)
    REFERENCES teachers (id);

-- End of file.

