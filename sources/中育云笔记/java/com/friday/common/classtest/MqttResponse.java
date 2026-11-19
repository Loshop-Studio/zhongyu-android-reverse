package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class MqttResponse {
    public static final int $stable = 8;
    private final Data data;
    private final String guid;
    private final int type;

    @StabilityInferred(parameters = 1)
    @Keep
    public static final class QuestionInfo {
        public static final int $stable = 0;
        private final int options;
        private final int qstCount;

        public QuestionInfo(int i10, int i11) {
            this.qstCount = i10;
            this.options = i11;
        }

        public static /* synthetic */ QuestionInfo copy$default(QuestionInfo questionInfo, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = questionInfo.qstCount;
            }
            if ((i12 & 2) != 0) {
                i11 = questionInfo.options;
            }
            return questionInfo.copy(i10, i11);
        }

        public final int component1() {
            return this.qstCount;
        }

        public final int component2() {
            return this.options;
        }

        public final QuestionInfo copy(int i10, int i11) {
            return new QuestionInfo(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuestionInfo)) {
                return false;
            }
            QuestionInfo questionInfo = (QuestionInfo) obj;
            return this.qstCount == questionInfo.qstCount && this.options == questionInfo.options;
        }

        public final int getOptions() {
            return this.options;
        }

        public final int getQstCount() {
            return this.qstCount;
        }

        public int hashCode() {
            return (Integer.hashCode(this.qstCount) * 31) + Integer.hashCode(this.options);
        }

        public String toString() {
            return "QuestionInfo(qstCount=" + this.qstCount + ", options=" + this.options + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Keep
    public static final class Student {
        public static final int $stable = 0;
        private final String studentId;
        private final String studentName;

        public Student(String studentName, String studentId) {
            AbstractC9979u.m20294g(studentName, "studentName");
            AbstractC9979u.m20294g(studentId, "studentId");
            this.studentName = studentName;
            this.studentId = studentId;
        }

        public static /* synthetic */ Student copy$default(Student student, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = student.studentName;
            }
            if ((i10 & 2) != 0) {
                str2 = student.studentId;
            }
            return student.copy(str, str2);
        }

        public final String component1() {
            return this.studentName;
        }

        public final String component2() {
            return this.studentId;
        }

        public final Student copy(String studentName, String studentId) {
            AbstractC9979u.m20294g(studentName, "studentName");
            AbstractC9979u.m20294g(studentId, "studentId");
            return new Student(studentName, studentId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Student)) {
                return false;
            }
            Student student = (Student) obj;
            return AbstractC9979u.m20289b(this.studentName, student.studentName) && AbstractC9979u.m20289b(this.studentId, student.studentId);
        }

        public final String getStudentId() {
            return this.studentId;
        }

        public final String getStudentName() {
            return this.studentName;
        }

        public int hashCode() {
            return (this.studentName.hashCode() * 31) + this.studentId.hashCode();
        }

        public String toString() {
            return "Student(studentName=" + this.studentName + ", studentId=" + this.studentId + ")";
        }
    }

    public MqttResponse(String guid, int i10, Data data) {
        AbstractC9979u.m20294g(guid, "guid");
        AbstractC9979u.m20294g(data, "data");
        this.guid = guid;
        this.type = i10;
        this.data = data;
    }

    public static /* synthetic */ MqttResponse copy$default(MqttResponse mqttResponse, String str, int i10, Data data, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mqttResponse.guid;
        }
        if ((i11 & 2) != 0) {
            i10 = mqttResponse.type;
        }
        if ((i11 & 4) != 0) {
            data = mqttResponse.data;
        }
        return mqttResponse.copy(str, i10, data);
    }

    public final String component1() {
        return this.guid;
    }

    public final int component2() {
        return this.type;
    }

    public final Data component3() {
        return this.data;
    }

    public final MqttResponse copy(String guid, int i10, Data data) {
        AbstractC9979u.m20294g(guid, "guid");
        AbstractC9979u.m20294g(data, "data");
        return new MqttResponse(guid, i10, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MqttResponse)) {
            return false;
        }
        MqttResponse mqttResponse = (MqttResponse) obj;
        return AbstractC9979u.m20289b(this.guid, mqttResponse.guid) && this.type == mqttResponse.type && AbstractC9979u.m20289b(this.data, mqttResponse.data);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.guid.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MqttResponse(guid=" + this.guid + ", type=" + this.type + ", data=" + this.data + ")";
    }

    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Data {
        public static final int $stable = 8;
        private final List<String> answerList;
        private boolean canSubmit;
        private final String imagePath;
        private final int options;
        private final int qstType;
        private final QuestionInfo questionInfo;
        private final Student student;

        public Data(String imagePath, int i10, int i11, Student student, List<String> answerList, boolean z10, QuestionInfo questionInfo) {
            AbstractC9979u.m20294g(imagePath, "imagePath");
            AbstractC9979u.m20294g(answerList, "answerList");
            this.imagePath = imagePath;
            this.qstType = i10;
            this.options = i11;
            this.student = student;
            this.answerList = answerList;
            this.canSubmit = z10;
            this.questionInfo = questionInfo;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i10, int i11, Student student, List list, boolean z10, QuestionInfo questionInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = data.imagePath;
            }
            if ((i12 & 2) != 0) {
                i10 = data.qstType;
            }
            if ((i12 & 4) != 0) {
                i11 = data.options;
            }
            if ((i12 & 8) != 0) {
                student = data.student;
            }
            if ((i12 & 16) != 0) {
                list = data.answerList;
            }
            if ((i12 & 32) != 0) {
                z10 = data.canSubmit;
            }
            if ((i12 & 64) != 0) {
                questionInfo = data.questionInfo;
            }
            boolean z11 = z10;
            QuestionInfo questionInfo2 = questionInfo;
            List list2 = list;
            int i13 = i11;
            return data.copy(str, i10, i13, student, list2, z11, questionInfo2);
        }

        public final String component1() {
            return this.imagePath;
        }

        public final int component2() {
            return this.qstType;
        }

        public final int component3() {
            return this.options;
        }

        public final Student component4() {
            return this.student;
        }

        public final List<String> component5() {
            return this.answerList;
        }

        public final boolean component6() {
            return this.canSubmit;
        }

        public final QuestionInfo component7() {
            return this.questionInfo;
        }

        public final Data copy(String imagePath, int i10, int i11, Student student, List<String> answerList, boolean z10, QuestionInfo questionInfo) {
            AbstractC9979u.m20294g(imagePath, "imagePath");
            AbstractC9979u.m20294g(answerList, "answerList");
            return new Data(imagePath, i10, i11, student, answerList, z10, questionInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return AbstractC9979u.m20289b(this.imagePath, data.imagePath) && this.qstType == data.qstType && this.options == data.options && AbstractC9979u.m20289b(this.student, data.student) && AbstractC9979u.m20289b(this.answerList, data.answerList) && this.canSubmit == data.canSubmit && AbstractC9979u.m20289b(this.questionInfo, data.questionInfo);
        }

        public final List<String> getAnswerList() {
            return this.answerList;
        }

        public final boolean getCanSubmit() {
            return this.canSubmit;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final int getOptions() {
            return this.options;
        }

        public final int getQstType() {
            return this.qstType;
        }

        public final QuestionInfo getQuestionInfo() {
            return this.questionInfo;
        }

        public final Student getStudent() {
            return this.student;
        }

        public int hashCode() {
            int iHashCode = ((((this.imagePath.hashCode() * 31) + Integer.hashCode(this.qstType)) * 31) + Integer.hashCode(this.options)) * 31;
            Student student = this.student;
            int iHashCode2 = (((((iHashCode + (student == null ? 0 : student.hashCode())) * 31) + this.answerList.hashCode()) * 31) + Boolean.hashCode(this.canSubmit)) * 31;
            QuestionInfo questionInfo = this.questionInfo;
            return iHashCode2 + (questionInfo != null ? questionInfo.hashCode() : 0);
        }

        public final void setCanSubmit(boolean z10) {
            this.canSubmit = z10;
        }

        public String toString() {
            return "Data(imagePath=" + this.imagePath + ", qstType=" + this.qstType + ", options=" + this.options + ", student=" + this.student + ", answerList=" + this.answerList + ", canSubmit=" + this.canSubmit + ", questionInfo=" + this.questionInfo + ")";
        }

        public /* synthetic */ Data(String str, int i10, int i11, Student student, List list, boolean z10, QuestionInfo questionInfo, int i12, AbstractC9972n abstractC9972n) {
            this(str, i10, i11, student, list, (i12 & 32) != 0 ? true : z10, questionInfo);
        }
    }
}
