package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.classtest.MqttResponse;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class ResponseScreencastData {
    public static final int $stable = 8;
    private final Integer ftpPort;
    private final List<MqttResponse.Student> studentList;
    private final long timeStamp;
    private final String topic;

    public ResponseScreencastData(String topic, List<MqttResponse.Student> studentList, long j10, Integer num) {
        AbstractC9979u.m20294g(topic, "topic");
        AbstractC9979u.m20294g(studentList, "studentList");
        this.topic = topic;
        this.studentList = studentList;
        this.timeStamp = j10;
        this.ftpPort = num;
    }

    public static /* synthetic */ ResponseScreencastData copy$default(ResponseScreencastData responseScreencastData, String str, List list, long j10, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseScreencastData.topic;
        }
        if ((i10 & 2) != 0) {
            list = responseScreencastData.studentList;
        }
        if ((i10 & 4) != 0) {
            j10 = responseScreencastData.timeStamp;
        }
        if ((i10 & 8) != 0) {
            num = responseScreencastData.ftpPort;
        }
        Integer num2 = num;
        return responseScreencastData.copy(str, list, j10, num2);
    }

    public final String component1() {
        return this.topic;
    }

    public final List<MqttResponse.Student> component2() {
        return this.studentList;
    }

    public final long component3() {
        return this.timeStamp;
    }

    public final Integer component4() {
        return this.ftpPort;
    }

    public final ResponseScreencastData copy(String topic, List<MqttResponse.Student> studentList, long j10, Integer num) {
        AbstractC9979u.m20294g(topic, "topic");
        AbstractC9979u.m20294g(studentList, "studentList");
        return new ResponseScreencastData(topic, studentList, j10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseScreencastData)) {
            return false;
        }
        ResponseScreencastData responseScreencastData = (ResponseScreencastData) obj;
        return AbstractC9979u.m20289b(this.topic, responseScreencastData.topic) && AbstractC9979u.m20289b(this.studentList, responseScreencastData.studentList) && this.timeStamp == responseScreencastData.timeStamp && AbstractC9979u.m20289b(this.ftpPort, responseScreencastData.ftpPort);
    }

    public final Integer getFtpPort() {
        return this.ftpPort;
    }

    public final List<MqttResponse.Student> getStudentList() {
        return this.studentList;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        int iHashCode = ((((this.topic.hashCode() * 31) + this.studentList.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31;
        Integer num = this.ftpPort;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ResponseScreencastData(topic=" + this.topic + ", studentList=" + this.studentList + ", timeStamp=" + this.timeStamp + ", ftpPort=" + this.ftpPort + ")";
    }

    public /* synthetic */ ResponseScreencastData(String str, List list, long j10, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, list, j10, (i10 & 8) != 0 ? null : num);
    }
}
