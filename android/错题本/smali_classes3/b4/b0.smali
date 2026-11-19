.class public final Lb4/b0;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lb4/c0;


# instance fields
.field public a:I

.field public b:J

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F


# virtual methods
.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb4/b0;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lb4/b0;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb4/b0;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb4/b0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0}, Lb4/b0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lb4/b0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0}, Lb4/b0;->f()V

    return-object p0
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/b0;

    return-object v0
.end method

.method public final e()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyMatrix$Matrix;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/z;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    if-eqz v1, :cond_9

    .line 10
    .line 11
    and-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-wide v2, p0, Lb4/b0;->b:J

    .line 16
    .line 17
    invoke-static {v0, v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix;->access$502(Lcom/zykj/board/EzyMatrix$Matrix;J)J

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 v2, v1, 0x2

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget v2, p0, Lb4/b0;->c:F

    .line 25
    .line 26
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$602(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 27
    .line 28
    .line 29
    :cond_1
    and-int/lit8 v2, v1, 0x4

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget v2, p0, Lb4/b0;->d:F

    .line 34
    .line 35
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$702(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 36
    .line 37
    .line 38
    :cond_2
    and-int/lit8 v2, v1, 0x8

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget v2, p0, Lb4/b0;->e:F

    .line 43
    .line 44
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$802(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 45
    .line 46
    .line 47
    :cond_3
    and-int/lit8 v2, v1, 0x10

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget v2, p0, Lb4/b0;->f:F

    .line 52
    .line 53
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$902(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 54
    .line 55
    .line 56
    :cond_4
    and-int/lit8 v2, v1, 0x20

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v2, p0, Lb4/b0;->g:F

    .line 61
    .line 62
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$1002(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 63
    .line 64
    .line 65
    :cond_5
    and-int/lit8 v2, v1, 0x40

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget v2, p0, Lb4/b0;->h:F

    .line 70
    .line 71
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$1102(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 72
    .line 73
    .line 74
    :cond_6
    and-int/lit16 v2, v1, 0x80

    .line 75
    .line 76
    if-eqz v2, :cond_7

    .line 77
    .line 78
    iget v2, p0, Lb4/b0;->i:F

    .line 79
    .line 80
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$1202(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 81
    .line 82
    .line 83
    :cond_7
    and-int/lit16 v2, v1, 0x100

    .line 84
    .line 85
    if-eqz v2, :cond_8

    .line 86
    .line 87
    iget v2, p0, Lb4/b0;->j:F

    .line 88
    .line 89
    invoke-static {v0, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->access$1302(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 90
    .line 91
    .line 92
    :cond_8
    and-int/lit16 v1, v1, 0x200

    .line 93
    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    iget v1, p0, Lb4/b0;->k:F

    .line 97
    .line 98
    invoke-static {v0, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->access$1402(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 99
    .line 100
    .line 101
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method

.method public final f()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lb4/b0;->a:I

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lb4/b0;->b:J

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lb4/b0;->c:F

    .line 13
    .line 14
    iput v0, p0, Lb4/b0;->d:F

    .line 15
    .line 16
    iput v0, p0, Lb4/b0;->e:F

    .line 17
    .line 18
    iput v0, p0, Lb4/b0;->f:F

    .line 19
    .line 20
    iput v0, p0, Lb4/b0;->g:F

    .line 21
    .line 22
    iput v0, p0, Lb4/b0;->h:F

    .line 23
    .line 24
    iput v0, p0, Lb4/b0;->i:F

    .line 25
    .line 26
    iput v0, p0, Lb4/b0;->j:F

    .line 27
    .line 28
    iput v0, p0, Lb4/b0;->k:F

    .line 29
    .line 30
    return-void
.end method

.method public final g(Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lb4/b0;->i(J)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    cmpl-float v0, v0, v1

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0, v0}, Lb4/b0;->m(F)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    cmpl-float v0, v0, v1

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p0, v0}, Lb4/b0;->o(F)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    cmpl-float v0, v0, v1

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p0, v0}, Lb4/b0;->q(F)V

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    cmpl-float v0, v0, v1

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, Lb4/b0;->p(F)V

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    cmpl-float v0, v0, v1

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0, v0}, Lb4/b0;->n(F)V

    .line 99
    .line 100
    .line 101
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    cmpl-float v0, v0, v1

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p0, v0}, Lb4/b0;->r(F)V

    .line 114
    .line 115
    .line 116
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    cmpl-float v0, v0, v1

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p0, v0}, Lb4/b0;->j(F)V

    .line 129
    .line 130
    .line 131
    :cond_8
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    cmpl-float v0, v0, v1

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p0, v0}, Lb4/b0;->k(F)V

    .line 144
    .line 145
    .line 146
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    cmpl-float v0, v0, v1

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {p0, v0}, Lb4/b0;->l(F)V

    .line 159
    .line 160
    .line 161
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lb4/b0;

    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/d0;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    :sswitch_0
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Lb4/b0;->k:F

    .line 34
    .line 35
    iget v1, p0, Lb4/b0;->a:I

    .line 36
    .line 37
    or-int/lit16 v1, v1, 0x200

    .line 38
    .line 39
    iput v1, p0, Lb4/b0;->a:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lb4/b0;->j:F

    .line 47
    .line 48
    iget v1, p0, Lb4/b0;->a:I

    .line 49
    .line 50
    or-int/lit16 v1, v1, 0x100

    .line 51
    .line 52
    iput v1, p0, Lb4/b0;->a:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Lb4/b0;->i:F

    .line 60
    .line 61
    iget v1, p0, Lb4/b0;->a:I

    .line 62
    .line 63
    or-int/lit16 v1, v1, 0x80

    .line 64
    .line 65
    iput v1, p0, Lb4/b0;->a:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput v1, p0, Lb4/b0;->h:F

    .line 73
    .line 74
    iget v1, p0, Lb4/b0;->a:I

    .line 75
    .line 76
    or-int/lit8 v1, v1, 0x40

    .line 77
    .line 78
    iput v1, p0, Lb4/b0;->a:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, p0, Lb4/b0;->g:F

    .line 86
    .line 87
    iget v1, p0, Lb4/b0;->a:I

    .line 88
    .line 89
    or-int/lit8 v1, v1, 0x20

    .line 90
    .line 91
    iput v1, p0, Lb4/b0;->a:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput v1, p0, Lb4/b0;->f:F

    .line 99
    .line 100
    iget v1, p0, Lb4/b0;->a:I

    .line 101
    .line 102
    or-int/lit8 v1, v1, 0x10

    .line 103
    .line 104
    iput v1, p0, Lb4/b0;->a:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iput v1, p0, Lb4/b0;->e:F

    .line 112
    .line 113
    iget v1, p0, Lb4/b0;->a:I

    .line 114
    .line 115
    or-int/lit8 v1, v1, 0x8

    .line 116
    .line 117
    iput v1, p0, Lb4/b0;->a:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iput v1, p0, Lb4/b0;->d:F

    .line 125
    .line 126
    iget v1, p0, Lb4/b0;->a:I

    .line 127
    .line 128
    or-int/lit8 v1, v1, 0x4

    .line 129
    .line 130
    iput v1, p0, Lb4/b0;->a:I

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    iput v1, p0, Lb4/b0;->c:F

    .line 138
    .line 139
    iget v1, p0, Lb4/b0;->a:I

    .line 140
    .line 141
    or-int/lit8 v1, v1, 0x2

    .line 142
    .line 143
    iput v1, p0, Lb4/b0;->a:I

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    iput-wide v3, p0, Lb4/b0;->b:J

    .line 152
    .line 153
    iget v1, p0, Lb4/b0;->a:I

    .line 154
    .line 155
    or-int/2addr v1, v2

    .line 156
    iput v1, p0, Lb4/b0;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_a
        0x15 -> :sswitch_9
        0x1d -> :sswitch_8
        0x25 -> :sswitch_7
        0x2d -> :sswitch_6
        0x35 -> :sswitch_5
        0x3d -> :sswitch_4
        0x45 -> :sswitch_3
        0x4d -> :sswitch_2
        0x55 -> :sswitch_1
    .end sparse-switch
.end method

.method public final i(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb4/b0;->b:J

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/d0;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 4
    .line 5
    const-class v2, Lb4/b0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final j(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->i:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->j:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x100

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->k:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x200

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final m(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->c:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lb4/b0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 5
    instance-of v0, p1, Lcom/zykj/board/EzyMatrix$Matrix;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {p0, p1}, Lb4/b0;->g(Lcom/zykj/board/EzyMatrix$Matrix;)V

    return-object p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lb4/b0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lb4/b0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8
    instance-of v0, p1, Lcom/zykj/board/EzyMatrix$Matrix;

    if-eqz v0, :cond_0

    .line 9
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {p0, p1}, Lb4/b0;->g(Lcom/zykj/board/EzyMatrix$Matrix;)V

    return-object p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lb4/b0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final n(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->g:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final o(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->d:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final p(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->f:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->e:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(F)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/b0;->h:F

    .line 2
    .line 3
    iget p1, p0, Lb4/b0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x40

    .line 6
    .line 7
    iput p1, p0, Lb4/b0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/b0;

    return-object p1
.end method
