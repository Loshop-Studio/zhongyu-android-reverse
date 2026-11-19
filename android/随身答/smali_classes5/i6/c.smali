.class public abstract Li6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getSuccess()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 21
    .line 22
    new-instance v1, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, ""

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    :cond_2
    move-object v3, v4

    .line 51
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    const/4 v5, 0x0

    .line 63
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-nez p0, :cond_5

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    move-object v4, p0

    .line 77
    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3, v5, v4}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public static final b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getSuccess()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 18
    .line 19
    new-instance v1, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, ""

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    :cond_2
    move-object v3, v4

    .line 48
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    const/4 v5, 0x0

    .line 60
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_6

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-nez p0, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    move-object v4, p0

    .line 74
    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3, v5, v4}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method
