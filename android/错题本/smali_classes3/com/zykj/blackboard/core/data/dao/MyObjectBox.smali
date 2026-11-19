.class public Lcom/zykj/blackboard/core/data/dao/MyObjectBox;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static buildEntityAudioInfoEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "AudioInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x10

    .line 8
    .line 9
    const-wide v1, 0x1821ce22bb5e1cf4L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x7

    .line 18
    const-wide v1, 0x31e068ed82716c6aL    # 1.9021126866710753E-68

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-wide v6, 0x3df5adc45832c1cfL    # 3.1546772850099355E-10

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    invoke-virtual {v4, v8, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v8}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const-string v4, "delayTime"

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-wide v6, 0x723d95511a0594ceL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const/4 v9, 0x2

    .line 61
    invoke-virtual {v4, v9, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-virtual {v4, v6}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const-string v4, "duration"

    .line 69
    .line 70
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/4 v7, 0x3

    .line 75
    const-wide v10, 0x54d92905e20ec0a9L    # 5.503176633865475E100

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v7, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v6}, Lio/objectbox/d;->b(I)V

    .line 84
    .line 85
    .line 86
    const-string v4, "isPlay"

    .line 87
    .line 88
    invoke-virtual {p0, v8, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-wide v7, 0xaf2de42001b3decL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v6}, Lio/objectbox/d;->b(I)V

    .line 101
    .line 102
    .line 103
    const/4 v4, 0x5

    .line 104
    const-string v6, "commandEnum"

    .line 105
    .line 106
    invoke-virtual {p0, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-wide v7, 0x3ce74d40b0b33b0cL    # 2.5870159730709684E-15

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v4, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v9}, Lio/objectbox/d;->b(I)V

    .line 119
    .line 120
    .line 121
    const-string v4, "data"

    .line 122
    .line 123
    const/16 v6, 0x17

    .line 124
    .line 125
    invoke-virtual {p0, v6, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const-wide v5, 0x58559dd6e2bc00deL    # 3.406943347156548E117

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v3, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 135
    .line 136
    .line 137
    const-string v3, "record"

    .line 138
    .line 139
    const/16 v4, 0xb

    .line 140
    .line 141
    const-string v5, "recordId"

    .line 142
    .line 143
    const-string v6, "AudioRecordEntity"

    .line 144
    .line 145
    invoke-virtual {p0, v4, v5, v6, v3}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->c(IJ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Lio/objectbox/d;->a()V

    .line 153
    .line 154
    .line 155
    const/16 v0, 0x60c

    .line 156
    .line 157
    iput v0, v3, Lio/objectbox/d;->f:I

    .line 158
    .line 159
    const/16 v0, 0x13

    .line 160
    .line 161
    const-wide v1, 0x3baaec7d5ab7bee2L    # 2.8506669117590014E-21

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->d(IJ)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method private static buildEntityAudioRecordEntity(Lio/objectbox/e;)V
    .locals 10

    .line 1
    const-string v0, "AudioRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x143a005b7cb491beL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    const-wide v2, 0xf5b1b65d8cb4a63L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x6

    .line 29
    const-string v5, "id"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-wide v7, 0x24c42d6a223414c6L    # 1.421337199502959E-131

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-virtual {v4, v5, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Lio/objectbox/d;->b(I)V

    .line 46
    .line 47
    .line 48
    const/16 v4, 0x9

    .line 49
    .line 50
    const-string v5, "fileName"

    .line 51
    .line 52
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v7, 0x2

    .line 57
    const-wide v8, 0x3a65a9d0bfa5344fL    # 2.187438487891372E-27

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 66
    .line 67
    .line 68
    const/16 v7, 0x820

    .line 69
    .line 70
    iput v7, v5, Lio/objectbox/d;->f:I

    .line 71
    .line 72
    const/16 v7, 0x1b

    .line 73
    .line 74
    const-wide v8, 0x5c7a7f7918c7b977L    # 3.081556804119893E137

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->d(IJ)V

    .line 80
    .line 81
    .line 82
    const-string v5, "validate"

    .line 83
    .line 84
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-wide v5, 0xe773eae157d9766L    # 5.577634912273987E-239

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, p0, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 94
    .line 95
    .line 96
    const-string v4, "record"

    .line 97
    .line 98
    const/16 v5, 0xb

    .line 99
    .line 100
    const-string v6, "recordId"

    .line 101
    .line 102
    const-string v7, "RecordEntity"

    .line 103
    .line 104
    invoke-virtual {v1, v5, v6, v7, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 112
    .line 113
    .line 114
    const/16 v0, 0x60c

    .line 115
    .line 116
    iput v0, v4, Lio/objectbox/d;->f:I

    .line 117
    .line 118
    const-wide v2, 0x5a708b91241696ffL    # 4.479914908924799E127

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 124
    .line 125
    .line 126
    const/16 v6, 0x10

    .line 127
    .line 128
    const-wide v7, 0x1821ce22bb5e1cf4L

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    const-string v2, "audioInfoEntity"

    .line 134
    .line 135
    const/4 v3, 0x3

    .line 136
    const-wide v4, 0x29badf06dfb61a9aL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method private static buildEntityAuthorEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "AuthorEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x13

    .line 8
    .line 9
    const-wide v1, 0x3e5357e4ada3de00L    # 1.8014882787748332E-8

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    const-wide v1, 0x795bd13e17ed8976L    # 3.8524042193251205E276

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x6

    .line 28
    const-string v4, "id"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-wide v6, 0x63a47f3492ac94f5L    # 9.901377937773907E171

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    invoke-virtual {v4, v8, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v8}, Lio/objectbox/d;->b(I)V

    .line 45
    .line 46
    .line 47
    const/16 v4, 0x9

    .line 48
    .line 49
    const-string v6, "authorName"

    .line 50
    .line 51
    invoke-virtual {p0, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const-wide v7, 0x66591c93a3e4ca37L    # 1.0670191673439913E185

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    const/4 v9, 0x2

    .line 61
    invoke-virtual {v6, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const-string v6, "authorId"

    .line 65
    .line 66
    invoke-virtual {p0, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const/4 v7, 0x3

    .line 71
    const-wide v10, 0x48167b914522db95L    # 1.912615350258664E39

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v7, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 77
    .line 78
    .line 79
    const-string v6, "schoolId"

    .line 80
    .line 81
    invoke-virtual {p0, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const/4 v7, 0x4

    .line 86
    const-wide v10, 0x1627306ce99a031aL    # 5.916950966792918E-202

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v7, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 92
    .line 93
    .line 94
    const-string v6, "url"

    .line 95
    .line 96
    invoke-virtual {p0, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const/4 v6, 0x5

    .line 101
    const-wide v7, 0x4963828c2e6fc659L    # 3.4806916575954826E45

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 107
    .line 108
    .line 109
    const-string v4, "startTime"

    .line 110
    .line 111
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-wide v6, 0x7b4b56c95ce7139fL    # 8.130714042277524E285

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v3, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v9}, Lio/objectbox/d;->b(I)V

    .line 124
    .line 125
    .line 126
    const-string v4, "duration"

    .line 127
    .line 128
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->c(IJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v9}, Lio/objectbox/d;->b(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method private static buildEntityBackgroundLineConfigEntity(Lio/objectbox/e;)V
    .locals 11

    .line 1
    const-string v0, "BackgroundLineConfigEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x18

    .line 8
    .line 9
    const-wide v1, 0x582ed697b92bdf72L    # 6.075445102957898E116

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    const-wide v1, 0x40aa6ba1e598f455L    # 3381.8162048147447

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x6

    .line 27
    const-string v4, "id"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-wide v6, 0x2a1eeb5284ffb48fL    # 8.425781163133835E-106

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v3, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Lio/objectbox/d;->b(I)V

    .line 44
    .line 45
    .line 46
    const-string v3, "lineColor"

    .line 47
    .line 48
    invoke-virtual {p0, v0, v3, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-wide v6, 0x5dd58e39531fdbb3L    # 1.0514225791642882E144

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const/4 v4, 0x2

    .line 58
    invoke-virtual {v3, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x4

    .line 62
    invoke-virtual {v3, v6}, Lio/objectbox/d;->b(I)V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x7

    .line 66
    const-string v7, "lineSpace"

    .line 67
    .line 68
    invoke-virtual {p0, v3, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const/4 v8, 0x3

    .line 73
    const-wide v9, 0x38103f118ad8e00fL    # 1.193594129807271E-38

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v6}, Lio/objectbox/d;->b(I)V

    .line 82
    .line 83
    .line 84
    const-string v7, "lineType"

    .line 85
    .line 86
    invoke-virtual {p0, v0, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const-wide v8, 0xd9bc0cf945727e9L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v6, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v4}, Lio/objectbox/d;->b(I)V

    .line 99
    .line 100
    .line 101
    const-string v4, "lineWidth"

    .line 102
    .line 103
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->c(IJ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v6}, Lio/objectbox/d;->b(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method private static buildEntityBlackBoardEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "BlackBoardEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x63dc7c0b0a9b02f1L    # 1.1007958709990701E173

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const-wide v3, 0x297ec3f7277a0b3L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    const-string v5, "id"

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-wide v7, 0x2743d5329c78e730L    # 1.536087090891531E-119

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    invoke-virtual {v1, v5, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5}, Lio/objectbox/d;->b(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "dir"

    .line 47
    .line 48
    const/16 v5, 0x9

    .line 49
    .line 50
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x820

    .line 61
    .line 62
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 63
    .line 64
    const-wide v3, 0x60d7ea301e46859aL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static buildEntityCommandInfoEntity(Lio/objectbox/e;)V
    .locals 13

    .line 1
    const-string v0, "CommandInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x6b755af57ffd23b8L    # 4.3879619178934526E209

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x7

    .line 17
    const-wide v3, 0xfadab4a85afb7c9L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x6

    .line 29
    const-string v5, "id"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-wide v7, 0x54c60888c2443752L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    invoke-virtual {v5, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v9}, Lio/objectbox/d;->b(I)V

    .line 46
    .line 47
    .line 48
    const-string v5, "delayTime"

    .line 49
    .line 50
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-wide v7, 0x6805b94c91fdd20dL    # 1.238920747690003E193

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const/4 v10, 0x2

    .line 60
    invoke-virtual {v5, v10, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 61
    .line 62
    .line 63
    const/4 v7, 0x4

    .line 64
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 65
    .line 66
    .line 67
    const-string v5, "duration"

    .line 68
    .line 69
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const/4 v8, 0x3

    .line 74
    const-wide v11, 0x288978be6c6ba440L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v8, v11, v12}, Lio/objectbox/d;->c(IJ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 83
    .line 84
    .line 85
    const-string v5, "isPlay"

    .line 86
    .line 87
    invoke-virtual {p0, v9, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-wide v8, 0x51685277948d4bc8L    # 1.476558101072009E84

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 100
    .line 101
    .line 102
    const-string v5, "commandEnum"

    .line 103
    .line 104
    invoke-virtual {p0, v2, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    const-wide v7, 0x27bf1a8028206a34L

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v2, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v10}, Lio/objectbox/d;->b(I)V

    .line 117
    .line 118
    .line 119
    const-string v5, "data"

    .line 120
    .line 121
    const/16 v7, 0x17

    .line 122
    .line 123
    invoke-virtual {p0, v7, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    const-wide v6, 0x628fd9b606855bc9L    # 5.8692548897736417E166

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v1, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 133
    .line 134
    .line 135
    const-string v1, "record"

    .line 136
    .line 137
    const/16 v5, 0xb

    .line 138
    .line 139
    const-string v6, "recordId"

    .line 140
    .line 141
    const-string v7, "CommandRecordEntity"

    .line 142
    .line 143
    invoke-virtual {p0, v5, v6, v7, v1}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 151
    .line 152
    .line 153
    const/16 v0, 0x60c

    .line 154
    .line 155
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 156
    .line 157
    const-wide v3, 0x59ced3a3aa6d8eeaL    # 4.0756369340203943E124

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method private static buildEntityCommandRecordEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "CommandRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 p0, 0x11

    .line 8
    .line 9
    const-wide v2, 0x1548b5dac4584f3bL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x4

    .line 18
    const-wide v2, 0x145bbef62e638d45L    # 1.3186894999677887E-210

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-wide v6, 0x11a78eed17072a81L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-virtual {v0, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0x9

    .line 50
    .line 51
    const-string v4, "fileName"

    .line 52
    .line 53
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/4 v6, 0x2

    .line 58
    const-wide v7, 0x6ba41be496d4e3c6L    # 3.3054951660216586E210

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 67
    .line 68
    .line 69
    const/16 v6, 0x820

    .line 70
    .line 71
    iput v6, v4, Lio/objectbox/d;->f:I

    .line 72
    .line 73
    const/16 v6, 0x1c

    .line 74
    .line 75
    const-wide v7, 0x2cfedb03be4eadccL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 81
    .line 82
    .line 83
    const-string v4, "validate"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v4, 0x3

    .line 90
    const-wide v5, 0x2184ff15cc150702L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    const-string v0, "record"

    .line 99
    .line 100
    const/16 v4, 0xb

    .line 101
    .line 102
    const-string v5, "recordId"

    .line 103
    .line 104
    const-string v6, "RecordEntity"

    .line 105
    .line 106
    invoke-virtual {v1, v4, v5, v6, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x60c

    .line 117
    .line 118
    iput p0, v0, Lio/objectbox/d;->f:I

    .line 119
    .line 120
    const/16 p0, 0x15

    .line 121
    .line 122
    const-wide v2, 0x7b458e5b3efe5544L    # 6.410851029960328E285

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 128
    .line 129
    .line 130
    const/4 v6, 0x5

    .line 131
    const-wide v7, 0x6b755af57ffd23b8L    # 4.3879619178934526E209

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    const-string v2, "commandInfoEntity"

    .line 137
    .line 138
    const/16 v3, 0x8

    .line 139
    .line 140
    const-wide v4, 0x470dff99a40b3975L    # 1.9470099503052123E34

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method private static buildEntityFileInfoEntity(Lio/objectbox/e;)V
    .locals 11

    .line 1
    const-string v0, "FileInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x63dd171e5aafdd1eL    # 1.1242058264470463E173

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    const-wide v3, 0x17f5d73a092137d2L    # 2.991919667346313E-193

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 26
    .line 27
    .line 28
    const-string v1, "id"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-virtual {p0, v0, v1, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-wide v6, 0x162019126113209eL    # 4.107552597570205E-202

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    invoke-virtual {v1, v8, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v8}, Lio/objectbox/d;->b(I)V

    .line 45
    .line 46
    .line 47
    const/16 v1, 0x9

    .line 48
    .line 49
    const-string v6, "fileName"

    .line 50
    .line 51
    invoke-virtual {p0, v1, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/4 v7, 0x2

    .line 56
    const-wide v8, 0x1cd2d62bfe0ff0bfL    # 7.798753111969411E-170

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const/4 v6, 0x5

    .line 65
    const-string v7, "width"

    .line 66
    .line 67
    invoke-virtual {p0, v6, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const/4 v8, 0x3

    .line 72
    const-wide v9, 0x3c22daf10c79dffeL    # 5.110723208511541E-19

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 78
    .line 79
    .line 80
    const/4 v8, 0x4

    .line 81
    invoke-virtual {v7, v8}, Lio/objectbox/d;->b(I)V

    .line 82
    .line 83
    .line 84
    const-string v7, "height"

    .line 85
    .line 86
    invoke-virtual {p0, v6, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const-wide v9, 0xf18c65b65753137L    # 6.087432070907445E-236

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v8}, Lio/objectbox/d;->b(I)V

    .line 99
    .line 100
    .line 101
    const-string v7, "validate"

    .line 102
    .line 103
    invoke-virtual {p0, v1, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-wide v7, 0x253989226c78d428L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 113
    .line 114
    .line 115
    const-string v1, "record"

    .line 116
    .line 117
    const/16 v5, 0xb

    .line 118
    .line 119
    const-string v6, "recordId"

    .line 120
    .line 121
    const-string v7, "FileRecordEntity"

    .line 122
    .line 123
    invoke-virtual {p0, v5, v6, v7, v1}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 131
    .line 132
    .line 133
    const/16 v0, 0x60c

    .line 134
    .line 135
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 136
    .line 137
    const-wide v3, 0x7c90c3b847a174e8L    # 1.0456039379741956E292

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method private static buildEntityFileRecordEntity(Lio/objectbox/e;)V
    .locals 10

    .line 1
    const-string v0, "FileRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x7a3b3e68f7eee809L    # 6.181636837701349E280

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    const-wide v2, 0x811086b6b794ba7L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x6

    .line 29
    const-string v5, "id"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-wide v7, 0x27b227de5a93056bL    # 1.7999298243737706E-117

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p0, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, p0}, Lio/objectbox/d;->b(I)V

    .line 45
    .line 46
    .line 47
    const/16 v4, 0x9

    .line 48
    .line 49
    const-string v5, "fileName"

    .line 50
    .line 51
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const/4 v7, 0x2

    .line 56
    const-wide v8, 0x3965a4971106c82eL    # 3.3346213718779845E-32

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 65
    .line 66
    .line 67
    const/16 v7, 0x820

    .line 68
    .line 69
    iput v7, v5, Lio/objectbox/d;->f:I

    .line 70
    .line 71
    const/16 v7, 0x19

    .line 72
    .line 73
    const-wide v8, 0x628d0c31ef9dfaa6L    # 5.352768087307387E166

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->d(IJ)V

    .line 79
    .line 80
    .line 81
    const-string v5, "validate"

    .line 82
    .line 83
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const/4 v5, 0x3

    .line 88
    const-wide v6, 0x10d1aaa075715941L    # 1.165236479874383E-227

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 94
    .line 95
    .line 96
    const-string v4, "record"

    .line 97
    .line 98
    const/16 v5, 0xb

    .line 99
    .line 100
    const-string v6, "recordId"

    .line 101
    .line 102
    const-string v7, "RecordEntity"

    .line 103
    .line 104
    invoke-virtual {v1, v5, v6, v7, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 112
    .line 113
    .line 114
    const/16 v0, 0x60c

    .line 115
    .line 116
    iput v0, v4, Lio/objectbox/d;->f:I

    .line 117
    .line 118
    const-wide v2, 0x40bac149bde47ad8L    # 6849.288053779594

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 124
    .line 125
    .line 126
    const/4 v6, 0x7

    .line 127
    const-wide v7, 0x63dd171e5aafdd1eL    # 1.1242058264470463E173

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    const-string v2, "fileInfoEntity"

    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    const-wide v4, 0x4ddb28374c7f7df0L    # 1.1439903129610062E67

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method private static buildEntityGeometryInfoEntity(Lio/objectbox/e;)V
    .locals 11

    .line 1
    const-string v0, "GeometryInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 p0, 0x15

    .line 8
    .line 9
    const-wide v2, 0x3b73328572703d25L    # 2.5407479504245543E-22

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x7

    .line 18
    const-wide v2, 0x7da1016e8c8bb2baL    # 1.390200757636992E297

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-wide v6, 0xa864565b33fd59dL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    invoke-virtual {v4, v8, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v8}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const-string v4, "width"

    .line 50
    .line 51
    invoke-virtual {v1, p0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const/4 v6, 0x2

    .line 56
    const-wide v7, 0x60970e75b7683618L    # 1.9784761928106642E157

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-virtual {v4, v6}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x5

    .line 69
    const-string v7, "color"

    .line 70
    .line 71
    invoke-virtual {v1, v4, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const/4 v8, 0x3

    .line 76
    const-wide v9, 0x697be9f004a6c592L    # 1.3354154321842682E200

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v6}, Lio/objectbox/d;->b(I)V

    .line 85
    .line 86
    .line 87
    const-string v7, "textSize"

    .line 88
    .line 89
    invoke-virtual {v1, p0, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-wide v8, 0x3b24a5d76029f660L    # 8.539737214003089E-24

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v6, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v6}, Lio/objectbox/d;->b(I)V

    .line 102
    .line 103
    .line 104
    const-string v7, "style"

    .line 105
    .line 106
    invoke-virtual {v1, v4, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    const-wide v8, 0x6a95fc87f9dad7a3L    # 2.757351734478225E205

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v4, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v6}, Lio/objectbox/d;->b(I)V

    .line 119
    .line 120
    .line 121
    const-string v7, "geometryType"

    .line 122
    .line 123
    invoke-virtual {v1, v4, v7, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const-wide v7, 0x35079f079f0e7519L    # 3.0827117485355496E-53

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v0, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v6}, Lio/objectbox/d;->b(I)V

    .line 136
    .line 137
    .line 138
    const-string v0, "record"

    .line 139
    .line 140
    const/16 v4, 0xb

    .line 141
    .line 142
    const-string v5, "recordId"

    .line 143
    .line 144
    const-string v6, "GeometryRecordEntity"

    .line 145
    .line 146
    invoke-virtual {v1, v4, v5, v6, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 154
    .line 155
    .line 156
    const/16 p0, 0x60c

    .line 157
    .line 158
    iput p0, v0, Lio/objectbox/d;->f:I

    .line 159
    .line 160
    const/16 p0, 0x20

    .line 161
    .line 162
    const-wide v2, 0x4353b235061b509bL    # 2.2175861451866732E16

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 168
    .line 169
    .line 170
    const/16 v6, 0x17

    .line 171
    .line 172
    const-wide v7, 0x386546444359d8fL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    const-string v2, "pointList"

    .line 178
    .line 179
    const/16 v3, 0xa

    .line 180
    .line 181
    const-wide v4, 0x223fdaa4e73e19feL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method private static buildEntityGeometryPointFEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "GeometryPointFEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x17

    .line 8
    .line 9
    const-wide v1, 0x386546444359d8fL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const-wide v1, 0x298b927b453a49a7L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-wide v6, 0x2225298153b3b563L    # 3.389467358073113E-144

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-virtual {v3, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x7

    .line 50
    const-string v4, "x"

    .line 51
    .line 52
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v6, 0x2

    .line 57
    const-wide v7, 0x58018d1c66f98919L    # 8.64441334697348E115

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v0}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const-string v4, "y"

    .line 69
    .line 70
    invoke-virtual {p0, v3, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/4 v4, 0x3

    .line 75
    const-wide v5, 0x1d6b8b87ab2da2d0L    # 5.83896409956348E-167

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v0}, Lio/objectbox/d;->b(I)V

    .line 84
    .line 85
    .line 86
    const-string v3, "record"

    .line 87
    .line 88
    const/16 v4, 0xb

    .line 89
    .line 90
    const-string v5, "recordId"

    .line 91
    .line 92
    const-string v6, "GeometryInfoEntity"

    .line 93
    .line 94
    invoke-virtual {p0, v4, v5, v6, v3}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->c(IJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Lio/objectbox/d;->a()V

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x60c

    .line 105
    .line 106
    iput v0, v3, Lio/objectbox/d;->f:I

    .line 107
    .line 108
    const/16 v0, 0x23

    .line 109
    .line 110
    const-wide v1, 0x29667464fe409b6fL    # 2.98784581848624E-109

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->d(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method private static buildEntityGeometryRecordEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "GeometryRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 p0, 0x16

    .line 8
    .line 9
    const-wide v2, 0x5b4afe63ca2aec04L    # 5.987571369674412E131

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x4

    .line 18
    const-wide v2, 0x59062de3ab842487L    # 7.1590473854322E120

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-wide v6, 0x60ccf1c47eaf8669L    # 1.9869748044823206E158

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-virtual {v0, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0x9

    .line 50
    .line 51
    const-string v4, "fileName"

    .line 52
    .line 53
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/4 v6, 0x2

    .line 58
    const-wide v7, 0x792cd783859e290cL    # 4.992857521539753E275

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 67
    .line 68
    .line 69
    const/16 v6, 0x820

    .line 70
    .line 71
    iput v6, v4, Lio/objectbox/d;->f:I

    .line 72
    .line 73
    const/16 v6, 0x21

    .line 74
    .line 75
    const-wide v7, 0x16f3bd539cc7a8L

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 81
    .line 82
    .line 83
    const-string v4, "validate"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v4, 0x3

    .line 90
    const-wide v5, 0x314c211f1ac8bf7L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    const-string v0, "record"

    .line 99
    .line 100
    const/16 v4, 0xb

    .line 101
    .line 102
    const-string v5, "recordId"

    .line 103
    .line 104
    const-string v6, "RecordEntity"

    .line 105
    .line 106
    invoke-virtual {v1, v4, v5, v6, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x60c

    .line 117
    .line 118
    iput p0, v0, Lio/objectbox/d;->f:I

    .line 119
    .line 120
    const/16 p0, 0x22

    .line 121
    .line 122
    const-wide v2, 0x71ec25a780642432L    # 5.865161973841052E240

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 128
    .line 129
    .line 130
    const/16 v6, 0x15

    .line 131
    .line 132
    const-wide v7, 0x3b73328572703d25L    # 2.5407479504245543E-22

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    const-string v2, "geometryInfoEntityList"

    .line 138
    .line 139
    const/16 v3, 0xb

    .line 140
    .line 141
    const-wide v4, 0x529d5f6ce8517dbeL    # 9.348962464412136E89

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method private static buildEntityHeaderEntity(Lio/objectbox/e;)V
    .locals 14

    .line 1
    const-string v0, "HeaderEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x754e29366e3d18f4L    # 1.1321705796970696E257

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p0, 0x6

    .line 13
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const-wide v2, 0xd15dfe4b3ef964fL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const-string v4, "id"

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-virtual {v1, p0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-wide v6, 0x3c315161e6b817cL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    invoke-virtual {v4, v8, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v8}, Lio/objectbox/d;->b(I)V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x5

    .line 49
    const-string v6, "version"

    .line 50
    .line 51
    invoke-virtual {v1, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/4 v7, 0x2

    .line 56
    const-wide v8, 0x2832a0eda7c276bfL    # 4.727837014036424E-115

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const-string v6, "width"

    .line 69
    .line 70
    invoke-virtual {v1, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const/4 v8, 0x3

    .line 75
    const-wide v9, 0x2000b63ec05e467eL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 84
    .line 85
    .line 86
    const-string v6, "height"

    .line 87
    .line 88
    invoke-virtual {v1, v4, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const-wide v8, 0x145cb461cae0711L

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 101
    .line 102
    .line 103
    const-string v6, "createDate"

    .line 104
    .line 105
    invoke-virtual {v1, p0, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    const-wide v8, 0x1631b2d368571a75L    # 9.031924829252947E-202

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v4, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 118
    .line 119
    .line 120
    const-string v6, "updateDate"

    .line 121
    .line 122
    invoke-virtual {v1, p0, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    const-wide v8, 0x37582a1bb8827261L    # 4.334292019357903E-42

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, p0, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 135
    .line 136
    .line 137
    const-string v6, "duration"

    .line 138
    .line 139
    invoke-virtual {v1, p0, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const/4 v8, 0x7

    .line 144
    const-wide v9, 0x5dc4a5c6f5cfe276L    # 5.035665061905148E143

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v7}, Lio/objectbox/d;->b(I)V

    .line 153
    .line 154
    .line 155
    const/16 v6, 0x9

    .line 156
    .line 157
    const-string v8, "convertUrl"

    .line 158
    .line 159
    invoke-virtual {v1, v6, v8, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    const-wide v9, 0x591d6bd1e14ad295L    # 1.8993203978300473E121

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    const/16 v11, 0xb

    .line 169
    .line 170
    invoke-virtual {v8, v11, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 171
    .line 172
    .line 173
    const-string v8, "defaultBackgroundColor"

    .line 174
    .line 175
    invoke-virtual {v1, v4, v8, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    const/16 v9, 0xc

    .line 180
    .line 181
    const-wide v12, 0x3479ed8c9c7be58L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v9, v12, v13}, Lio/objectbox/d;->c(IJ)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 190
    .line 191
    .line 192
    const-string v8, "lastBackgroundColor"

    .line 193
    .line 194
    invoke-virtual {v1, v4, v8, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    const/16 v5, 0xd

    .line 199
    .line 200
    const-wide v8, 0x5ef2c96c797c96d4L    # 2.402209848487694E149

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v5, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v7}, Lio/objectbox/d;->b(I)V

    .line 209
    .line 210
    .line 211
    const-string v4, "PageEntity"

    .line 212
    .line 213
    const-string v5, "page"

    .line 214
    .line 215
    const-string v7, "pageId"

    .line 216
    .line 217
    invoke-virtual {v1, v11, v7, v4, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const-wide v7, 0x5073fe22d566d0a0L    # 3.703997927509147E79

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 230
    .line 231
    .line 232
    const/16 v5, 0x60c

    .line 233
    .line 234
    iput v5, v4, Lio/objectbox/d;->f:I

    .line 235
    .line 236
    const-wide v6, 0x618d9cc38cb214b0L    # 8.326465607446181E161

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, p0, v6, v7}, Lio/objectbox/d;->d(IJ)V

    .line 242
    .line 243
    .line 244
    const-string p0, "defaultBackgroundLineConfig"

    .line 245
    .line 246
    const-string v4, "defaultBackgroundLineConfigId"

    .line 247
    .line 248
    const-string v6, "BackgroundLineConfigEntity"

    .line 249
    .line 250
    invoke-virtual {v1, v11, v4, v6, p0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    const/16 v4, 0xf

    .line 255
    .line 256
    const-wide v7, 0x581c9919bdfc010L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v4, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 265
    .line 266
    .line 267
    iput v5, p0, Lio/objectbox/d;->f:I

    .line 268
    .line 269
    const/16 v4, 0x24

    .line 270
    .line 271
    const-wide v7, 0x97c5e857b75953eL

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    invoke-virtual {p0, v4, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 277
    .line 278
    .line 279
    const-string p0, "lastBackgroundLineConfigId"

    .line 280
    .line 281
    const-string v4, "lastBackgroundLineConfig"

    .line 282
    .line 283
    invoke-virtual {v1, v11, p0, v6, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 291
    .line 292
    .line 293
    iput v5, p0, Lio/objectbox/d;->f:I

    .line 294
    .line 295
    const/16 v0, 0x25

    .line 296
    .line 297
    const-wide v2, 0x7ca10aec1c1127b1L    # 2.125902392634659E292

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 303
    .line 304
    .line 305
    const-string p0, "AuthorEntity"

    .line 306
    .line 307
    const-string v0, "author"

    .line 308
    .line 309
    const-string v2, "authorId"

    .line 310
    .line 311
    invoke-virtual {v1, v11, v2, p0, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    const/16 v0, 0xa

    .line 316
    .line 317
    const-wide v2, 0x607e83596c68bd4cL    # 6.54581695175614E156

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 326
    .line 327
    .line 328
    iput v5, p0, Lio/objectbox/d;->f:I

    .line 329
    .line 330
    const/16 v0, 0x17

    .line 331
    .line 332
    const-wide v2, 0x57bcf5752f9f2deL

    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 338
    .line 339
    .line 340
    const-string p0, "MoveConfigEntity"

    .line 341
    .line 342
    const-string v0, "moveConfig"

    .line 343
    .line 344
    const-string v2, "moveConfigId"

    .line 345
    .line 346
    invoke-virtual {v1, v11, v2, p0, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    const/16 v0, 0xe

    .line 351
    .line 352
    const-wide v2, 0x6a405e4d9ef8a600L    # 6.414939514739602E203

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 361
    .line 362
    .line 363
    iput v5, p0, Lio/objectbox/d;->f:I

    .line 364
    .line 365
    const/16 v0, 0x1f

    .line 366
    .line 367
    const-wide v2, 0x17d7174ca5fefd12L    # 7.907984196179323E-194

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    invoke-virtual {p0, v0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 373
    .line 374
    .line 375
    const/16 v6, 0x13

    .line 376
    .line 377
    const-wide v7, 0x3e5357e4ada3de00L    # 1.8014882787748332E-8

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    const-string v2, "provider"

    .line 383
    .line 384
    const/16 v3, 0x9

    .line 385
    .line 386
    const-wide v4, 0x5c9a464a583801d8L    # 1.222232084959281E138

    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 395
    .line 396
    .line 397
    return-void
.end method

.method private static buildEntityMatrixEventEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "MatrixEventEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 p0, 0xf

    .line 8
    .line 9
    const-wide v2, 0xad76e0fc8e41f9L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x2

    .line 18
    const-wide v2, 0x258655e0575ca580L    # 6.444461660409176E-128

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    const/4 v4, 0x0

    .line 31
    const-string v5, "id"

    .line 32
    .line 33
    invoke-virtual {v1, v0, v5, v4, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-wide v4, 0x11f653dd53c49b2eL    # 3.86051436438075E-222

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    invoke-virtual {v0, v6, v4, v5}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v6}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const-string v0, "record"

    .line 50
    .line 51
    const/16 v4, 0xb

    .line 52
    .line 53
    const-string v5, "recordId"

    .line 54
    .line 55
    const-string v6, "MatrixRecordEntity"

    .line 56
    .line 57
    invoke-virtual {v1, v4, v5, v6, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 65
    .line 66
    .line 67
    const/16 p0, 0x60c

    .line 68
    .line 69
    iput p0, v0, Lio/objectbox/d;->f:I

    .line 70
    .line 71
    const/16 p0, 0x12

    .line 72
    .line 73
    const-wide v2, 0x7e387dcf62844dc9L    # 1.0251091742486452E300

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 79
    .line 80
    .line 81
    const/16 v6, 0x9

    .line 82
    .line 83
    const-wide v7, 0x65da0e67ab7a5f82L    # 4.324835817733301E182

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    const-string v2, "matrixInfo"

    .line 89
    .line 90
    const/4 v3, 0x5

    .line 91
    const-wide v4, 0x2f37c12586c5b86L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method private static buildEntityMatrixInfoEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "MatrixInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x65da0e67ab7a5f82L    # 4.324835817733301E182

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0xc

    .line 18
    .line 19
    const-wide v3, 0x217ccec6ff13edd8L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    const-string v5, "id"

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-wide v7, 0x1cfb7f714e836bL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    invoke-virtual {v5, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v9}, Lio/objectbox/d;->b(I)V

    .line 48
    .line 49
    .line 50
    const-string v5, "eventTime"

    .line 51
    .line 52
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v7, 0x2

    .line 57
    const-wide v8, 0x6141370e4361d67fL    # 3.0253545764999797E160

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 63
    .line 64
    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 67
    .line 68
    .line 69
    const/4 v5, 0x7

    .line 70
    const-string v8, "scaleX"

    .line 71
    .line 72
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    const/4 v9, 0x3

    .line 77
    const-wide v10, 0x254cdfc5bfc6276eL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, v9, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 86
    .line 87
    .line 88
    const-string v8, "skewX"

    .line 89
    .line 90
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    const-wide v9, 0x5dd9a36cb32f399aL    # 1.2505713658865408E144

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, v7, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 103
    .line 104
    .line 105
    const-string v8, "transX"

    .line 106
    .line 107
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    const/4 v9, 0x5

    .line 112
    const-wide v10, 0x60a85ab3c2fd94f6L    # 4.179684475923936E157

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, v9, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 121
    .line 122
    .line 123
    const-string v8, "skewY"

    .line 124
    .line 125
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    const-wide v9, 0x2df660f6a8e4f0d8L    # 2.81240173525624E-87

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v1, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 138
    .line 139
    .line 140
    const-string v1, "scaleY"

    .line 141
    .line 142
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-wide v8, 0x6d5305f5dd2abe9eL    # 4.197032521018234E218

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v5, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 155
    .line 156
    .line 157
    const-string v1, "transY"

    .line 158
    .line 159
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/16 v8, 0x8

    .line 164
    .line 165
    const-wide v9, 0x19fbf83adab8eea8L

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 174
    .line 175
    .line 176
    const-string v1, "perSp0"

    .line 177
    .line 178
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-wide v8, 0x10178dfd55f17e2L

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 191
    .line 192
    .line 193
    const-string v1, "perSp1"

    .line 194
    .line 195
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const/16 v8, 0xa

    .line 200
    .line 201
    const-wide v9, 0x617c0ce005de8cf6L    # 3.9436203609995825E161

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 210
    .line 211
    .line 212
    const-string v1, "perSp2"

    .line 213
    .line 214
    invoke-virtual {p0, v5, v1, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    const-wide v5, 0x23da7357748d92e3L    # 5.6861292625007E-136

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    const/16 v8, 0xb

    .line 224
    .line 225
    invoke-virtual {v1, v8, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 229
    .line 230
    .line 231
    const-string v1, "MatrixEventEntity"

    .line 232
    .line 233
    const-string v5, "record"

    .line 234
    .line 235
    const-string v6, "recordId"

    .line 236
    .line 237
    invoke-virtual {p0, v8, v6, v1, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 245
    .line 246
    .line 247
    const/16 v0, 0x60c

    .line 248
    .line 249
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 250
    .line 251
    const-wide v3, 0x45300b9f4bcb5367L    # 1.9397697639004028E25

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method private static buildEntityMatrixRecordEntity(Lio/objectbox/e;)V
    .locals 9

    .line 1
    const-string v0, "MatrixRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 p0, 0x12

    .line 8
    .line 9
    const-wide v2, 0x6425ecbc75f110e3L    # 2.711328694214946E174

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x4

    .line 18
    const-wide v2, 0x417714e698534d78L    # 2.420285752033755E7

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    const-string v4, "id"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-wide v6, 0x2e3e7dea1a0ed0afL    # 6.131194186689077E-86

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-virtual {v0, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0x9

    .line 50
    .line 51
    const-string v4, "fileName"

    .line 52
    .line 53
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/4 v6, 0x2

    .line 58
    const-wide v7, 0x3673e40f77847b34L    # 2.1775807016635797E-46

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 67
    .line 68
    .line 69
    const/16 v6, 0x820

    .line 70
    .line 71
    iput v6, v4, Lio/objectbox/d;->f:I

    .line 72
    .line 73
    const/16 v6, 0x1d

    .line 74
    .line 75
    const-wide v7, 0x286fd37d4c252d94L    # 6.461829477130387E-114

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v6, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 81
    .line 82
    .line 83
    const-string v4, "validate"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v4, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v4, 0x3

    .line 90
    const-wide v5, 0x23cb507c08570f4aL    # 2.93591528564138E-136

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    const-string v0, "record"

    .line 99
    .line 100
    const/16 v4, 0xb

    .line 101
    .line 102
    const-string v5, "recordId"

    .line 103
    .line 104
    const-string v6, "RecordEntity"

    .line 105
    .line 106
    invoke-virtual {v1, v4, v5, v6, v0}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 114
    .line 115
    .line 116
    const/16 p0, 0x60c

    .line 117
    .line 118
    iput p0, v0, Lio/objectbox/d;->f:I

    .line 119
    .line 120
    const/16 p0, 0x16

    .line 121
    .line 122
    const-wide v2, 0x4a96355026870e43L    # 2.0772735966702945E51

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 128
    .line 129
    .line 130
    const/16 v6, 0xf

    .line 131
    .line 132
    const-wide v7, 0xad76e0fc8e41f9L

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    const-string v2, "matrixEventEntity"

    .line 138
    .line 139
    const/4 v3, 0x6

    .line 140
    const-wide v4, 0x67da939b37af308cL    # 1.8945953255307357E192

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method private static buildEntityMoveConfigEntity(Lio/objectbox/e;)V
    .locals 8

    .line 1
    const-string v0, "MoveConfigEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    const-wide v1, 0x24ede333c59801e7L    # 8.42134793102194E-131

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x9

    .line 18
    .line 19
    const-wide v1, 0x1021a5c97e1dc104L    # 5.683542714005376E-231

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    const-string v1, "id"

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {p0, v0, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-wide v3, 0x7327104fa5ad7e2eL    # 5.0393640673685266E246

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-virtual {v1, v5, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v5}, Lio/objectbox/d;->b(I)V

    .line 45
    .line 46
    .line 47
    const-string v1, "isEnable"

    .line 48
    .line 49
    invoke-virtual {p0, v5, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v3, 0x2

    .line 54
    const-wide v6, 0x3cdf3df2fec8f701L    # 1.7342787796594636E-15

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x4

    .line 63
    invoke-virtual {v1, v3}, Lio/objectbox/d;->b(I)V

    .line 64
    .line 65
    .line 66
    const-string v1, "verticalTranslate"

    .line 67
    .line 68
    invoke-virtual {p0, v5, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v4, 0x3

    .line 73
    const-wide v6, 0x5ea3ca1252db7ecaL    # 7.907500800341909E147

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Lio/objectbox/d;->b(I)V

    .line 82
    .line 83
    .line 84
    const-string v1, "horizontalTranslate"

    .line 85
    .line 86
    invoke-virtual {p0, v5, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-wide v6, 0x60fffb7b98b7edd2L    # 1.756419148789716E159

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v3}, Lio/objectbox/d;->b(I)V

    .line 99
    .line 100
    .line 101
    const-string v1, "scale"

    .line 102
    .line 103
    invoke-virtual {p0, v5, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-wide v6, 0x23848efb404eaef0L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    const/4 v4, 0x5

    .line 113
    invoke-virtual {v1, v4, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3}, Lio/objectbox/d;->b(I)V

    .line 117
    .line 118
    .line 119
    const-string v1, "rotate"

    .line 120
    .line 121
    invoke-virtual {p0, v5, v1, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-wide v5, 0x2be77f89766a0ca8L    # 3.4378414503125407E-97

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v3}, Lio/objectbox/d;->b(I)V

    .line 134
    .line 135
    .line 136
    const-string v0, "maxHeightTimes"

    .line 137
    .line 138
    invoke-virtual {p0, v4, v0, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const/4 v1, 0x7

    .line 143
    const-wide v5, 0x573a48b7fc3db06eL    # 1.5802682377175556E112

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Lio/objectbox/d;->b(I)V

    .line 152
    .line 153
    .line 154
    const-string v0, "maxWidthTimes"

    .line 155
    .line 156
    invoke-virtual {p0, v4, v0, v2, v2}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const/16 v1, 0x8

    .line 161
    .line 162
    const-wide v4, 0x5536ee4aa93f817dL    # 3.209949913814738E102

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1, v4, v5}, Lio/objectbox/d;->c(IJ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v3}, Lio/objectbox/d;->b(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method private static buildEntityPageEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "PageEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x2c301a521cdd61bcL    # 7.538817029493378E-96

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    const-wide v3, 0x65017005ff741fc2L    # 3.533083862144532E178

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    const-string v5, "id"

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-wide v7, 0x39b7619ac8765320L    # 1.1527855175444541E-30

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    invoke-virtual {v5, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v9}, Lio/objectbox/d;->b(I)V

    .line 48
    .line 49
    .line 50
    const/16 v5, 0x9

    .line 51
    .line 52
    const-string v7, "dirName"

    .line 53
    .line 54
    invoke-virtual {p0, v5, v7, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    const/4 v8, 0x2

    .line 59
    const-wide v10, 0x710889879089a603L    # 3.120700247195438E236

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v8, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Lio/objectbox/d;->a()V

    .line 68
    .line 69
    .line 70
    const/16 v8, 0x820

    .line 71
    .line 72
    iput v8, v7, Lio/objectbox/d;->f:I

    .line 73
    .line 74
    const-wide v10, 0xf53623508030af3L    # 7.620409608188489E-235

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v2, v10, v11}, Lio/objectbox/d;->d(IJ)V

    .line 80
    .line 81
    .line 82
    const-string v2, "isChange"

    .line 83
    .line 84
    invoke-virtual {p0, v9, v2, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v7, 0x3

    .line 89
    const-wide v8, 0x7c410724bf9b6333L    # 3.318845523652946E290

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x4

    .line 98
    invoke-virtual {v2, v7}, Lio/objectbox/d;->b(I)V

    .line 99
    .line 100
    .line 101
    const-string v2, "commandFileName"

    .line 102
    .line 103
    invoke-virtual {p0, v5, v2, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-wide v8, 0x507beb8bedc39503L    # 5.172683458485401E79

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x5

    .line 116
    const-string v5, "commandIndex"

    .line 117
    .line 118
    invoke-virtual {p0, v2, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    const-wide v8, 0x3562d080a51168a9L    # 1.5714572702823095E-51

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v2, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 131
    .line 132
    .line 133
    const/16 v2, 0xb

    .line 134
    .line 135
    const-string v5, "blackBoardEntityId"

    .line 136
    .line 137
    const-string v6, "BlackBoardEntity"

    .line 138
    .line 139
    const-string v7, "blackBoardEntity"

    .line 140
    .line 141
    invoke-virtual {p0, v2, v5, v6, v7}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    const-wide v6, 0x58679da57d74c745L    # 7.444081209660393E117

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v1, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 154
    .line 155
    .line 156
    const/16 v1, 0x60c

    .line 157
    .line 158
    iput v1, v5, Lio/objectbox/d;->f:I

    .line 159
    .line 160
    const/16 v6, 0xf

    .line 161
    .line 162
    const-wide v7, 0x1e6b9b6603773476L    # 3.835234821922164E-162

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v6, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 168
    .line 169
    .line 170
    const-string v5, "RecordEntity"

    .line 171
    .line 172
    const-string v6, "recordEntity"

    .line 173
    .line 174
    const-string v7, "recordEntityId"

    .line 175
    .line 176
    invoke-virtual {p0, v2, v7, v5, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    const/4 v6, 0x7

    .line 181
    const-wide v7, 0x5b0e0205497c8e60L    # 4.1600987994099993E130

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v6, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 190
    .line 191
    .line 192
    iput v1, v5, Lio/objectbox/d;->f:I

    .line 193
    .line 194
    const/16 v6, 0x10

    .line 195
    .line 196
    const-wide v7, 0x4705ee83835c6937L    # 1.4234483382305521E34

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-virtual {v5, v6, v7, v8}, Lio/objectbox/d;->d(IJ)V

    .line 202
    .line 203
    .line 204
    const-string v5, "HeaderEntity"

    .line 205
    .line 206
    const-string v6, "headerEntity"

    .line 207
    .line 208
    const-string v7, "headerEntityId"

    .line 209
    .line 210
    invoke-virtual {p0, v2, v7, v5, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v2, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Lio/objectbox/d;->a()V

    .line 218
    .line 219
    .line 220
    iput v1, v2, Lio/objectbox/d;->f:I

    .line 221
    .line 222
    const/16 v0, 0x11

    .line 223
    .line 224
    const-wide v3, 0x47e3a7432d30335fL    # 2.0899046397533488E38

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v0, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 233
    .line 234
    .line 235
    return-void
.end method

.method private static buildEntityRecordEntity(Lio/objectbox/e;)V
    .locals 8

    .line 1
    const-string v0, "RecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0xc5ebc9a4e196b48L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const-wide v3, 0x28107d878f7f7a91L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "id"

    .line 32
    .line 33
    invoke-virtual {p0, v1, v6, v5, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-wide v5, 0x7d8c1a1d980de013L    # 5.743322363501047E296

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    invoke-virtual {v1, v7, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v7}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const-string v1, "page"

    .line 50
    .line 51
    const/16 v5, 0xb

    .line 52
    .line 53
    const-string v6, "pageId"

    .line 54
    .line 55
    const-string v7, "PageEntity"

    .line 56
    .line 57
    invoke-virtual {p0, v5, v6, v7, v1}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x60c

    .line 68
    .line 69
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 70
    .line 71
    const-wide v3, 0x7ac5a0e5cad341ccL    # 2.512652707076083E283

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method private static buildEntityTextInfoEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "TextInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, 0x2ad249dde21a669dL    # 2.041364533062447E-102

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v2, 0xb

    .line 13
    .line 14
    invoke-virtual {p0, v2, v0, v1}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x7

    .line 18
    const-wide v3, 0x4b3ff927d7671ce3L    # 3.0624302990940455E54

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v3, v4}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    const-string v5, "id"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual {p0, v1, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-wide v7, 0x6908a7b7430412eeL    # 9.214985227341497E197

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    invoke-virtual {v5, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v9}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const-string v5, "width"

    .line 50
    .line 51
    invoke-virtual {p0, v0, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const/4 v7, 0x2

    .line 56
    const-wide v8, 0x5550d1b3731f3d9L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v5, v7}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x5

    .line 69
    const-string v8, "color"

    .line 70
    .line 71
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const/4 v9, 0x3

    .line 76
    const-wide v10, 0x4814764c64549c4fL    # 1.7407232228567848E39

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v9, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 85
    .line 86
    .line 87
    const-string v8, "textSize"

    .line 88
    .line 89
    invoke-virtual {p0, v0, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    const-wide v9, 0x21bc620dadcee10aL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v7, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 102
    .line 103
    .line 104
    const-string v8, "style"

    .line 105
    .line 106
    invoke-virtual {p0, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const-wide v9, 0x49595ddff0daa73fL    # 2.262785102691098E45

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v5, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v7}, Lio/objectbox/d;->b(I)V

    .line 119
    .line 120
    .line 121
    const-string v5, "content"

    .line 122
    .line 123
    const/16 v7, 0x9

    .line 124
    .line 125
    invoke-virtual {p0, v7, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-wide v6, 0x50486effaa4fcef1L    # 5.658432552979549E78

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v1, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 135
    .line 136
    .line 137
    const-string v1, "TextRecordEntity"

    .line 138
    .line 139
    const-string v5, "record"

    .line 140
    .line 141
    const-string v6, "recordId"

    .line 142
    .line 143
    invoke-virtual {p0, v2, v6, v1, v5}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1, v0, v3, v4}, Lio/objectbox/d;->c(IJ)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Lio/objectbox/d;->a()V

    .line 151
    .line 152
    .line 153
    const/16 v0, 0x60c

    .line 154
    .line 155
    iput v0, v1, Lio/objectbox/d;->f:I

    .line 156
    .line 157
    const-wide v3, 0x2f8759000e5df20eL    # 9.845424909027698E-80

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2, v3, v4}, Lio/objectbox/d;->d(IJ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method private static buildEntityTextRecordEntity(Lio/objectbox/e;)V
    .locals 10

    .line 1
    const-string v0, "TextRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x1b1aaeb557d54fc5L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    const-wide v2, 0xcb7658b44084f35L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x6

    .line 29
    const-string v5, "id"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-wide v7, 0x5ecbf7311223ab7L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-virtual {v4, v5, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Lio/objectbox/d;->b(I)V

    .line 46
    .line 47
    .line 48
    const/16 v4, 0x9

    .line 49
    .line 50
    const-string v5, "fileName"

    .line 51
    .line 52
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-wide v7, 0x41e6c1ccba9d099dL    # 3.0543968849074235E9

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, p0, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 65
    .line 66
    .line 67
    const/16 v7, 0x820

    .line 68
    .line 69
    iput v7, v5, Lio/objectbox/d;->f:I

    .line 70
    .line 71
    const/16 v7, 0x1a

    .line 72
    .line 73
    const-wide v8, 0x7da7ffb2c22b03b4L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->d(IJ)V

    .line 79
    .line 80
    .line 81
    const-string v5, "validate"

    .line 82
    .line 83
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const/4 v5, 0x3

    .line 88
    const-wide v6, 0x6577f51f66c5d325L    # 6.21325389930849E180

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 94
    .line 95
    .line 96
    const-string v4, "record"

    .line 97
    .line 98
    const/16 v5, 0xb

    .line 99
    .line 100
    const-string v6, "recordId"

    .line 101
    .line 102
    const-string v7, "RecordEntity"

    .line 103
    .line 104
    invoke-virtual {v1, v5, v6, v7, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 112
    .line 113
    .line 114
    const/16 v0, 0x60c

    .line 115
    .line 116
    iput v0, v4, Lio/objectbox/d;->f:I

    .line 117
    .line 118
    const-wide v2, 0x74debce7b0799ccfL    # 9.014272611409265E254

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 124
    .line 125
    .line 126
    const/16 v6, 0xb

    .line 127
    .line 128
    const-wide v7, 0x2ad249dde21a669dL    # 2.041364533062447E-102

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    const-string v2, "textInfoEntityList"

    .line 134
    .line 135
    const/4 v3, 0x2

    .line 136
    const-wide v4, 0x66e07ecb76af2b2fL    # 3.5886187894109435E187

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method private static buildEntityTouchEventEntity(Lio/objectbox/e;)V
    .locals 12

    .line 1
    const-string v0, "TouchEventEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x273e2eef06fdc26dL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p0, 0x4

    .line 13
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    const-wide v2, 0x3e8a7bfd368eac0dL    # 1.9732365366445527E-7

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    const-string v5, "id"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-wide v7, 0xf2c4ec2c55cbf73L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    invoke-virtual {v5, v9, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v9}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x7

    .line 50
    const-string v7, "width"

    .line 51
    .line 52
    invoke-virtual {v1, v5, v7, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const/4 v8, 0x2

    .line 57
    const-wide v9, 0x331ec98cf630f14bL    # 1.8709949490949323E-62

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v8, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, p0}, Lio/objectbox/d;->b(I)V

    .line 66
    .line 67
    .line 68
    const/4 v7, 0x5

    .line 69
    const-string v8, "color"

    .line 70
    .line 71
    invoke-virtual {v1, v7, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const/4 v9, 0x3

    .line 76
    const-wide v10, 0x7705679243d05a94L    # 2.1568146167128862E265

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v9, v10, v11}, Lio/objectbox/d;->c(IJ)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, p0}, Lio/objectbox/d;->b(I)V

    .line 85
    .line 86
    .line 87
    const-string v8, "spacing"

    .line 88
    .line 89
    invoke-virtual {v1, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    const-wide v9, 0x2c86d895e15b0c67L    # 3.4226480378560025E-94

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, p0, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, p0}, Lio/objectbox/d;->b(I)V

    .line 102
    .line 103
    .line 104
    const-string v8, "itemLength"

    .line 105
    .line 106
    invoke-virtual {v1, v5, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const-wide v9, 0x3388beb3c86f8bfeL    # 1.924851027902676E-60

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v7, v9, v10}, Lio/objectbox/d;->c(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, p0}, Lio/objectbox/d;->b(I)V

    .line 119
    .line 120
    .line 121
    const-string v8, "style"

    .line 122
    .line 123
    invoke-virtual {v1, v7, v8, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    const-wide v8, 0x3f8c5bc3ee480593L    # 0.013846903523701914

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v4, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, p0}, Lio/objectbox/d;->b(I)V

    .line 136
    .line 137
    .line 138
    const-string v4, "textSize"

    .line 139
    .line 140
    invoke-virtual {v1, v5, v4, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    const-wide v6, 0x51ecca1fb112e548L    # 4.47428444678872E86

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, p0}, Lio/objectbox/d;->b(I)V

    .line 153
    .line 154
    .line 155
    const-string v4, "record"

    .line 156
    .line 157
    const/16 v5, 0xb

    .line 158
    .line 159
    const-string v6, "recordId"

    .line 160
    .line 161
    const-string v7, "TouchRecordEntity"

    .line 162
    .line 163
    invoke-virtual {v1, v5, v6, v7, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v4, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 171
    .line 172
    .line 173
    const/16 v0, 0x60c

    .line 174
    .line 175
    iput v0, v4, Lio/objectbox/d;->f:I

    .line 176
    .line 177
    const-wide v2, 0x477f5443ddfc2b04L    # 2.6027248321474314E36

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 183
    .line 184
    .line 185
    const/16 v6, 0xd

    .line 186
    .line 187
    const-wide v7, 0x6c829fd26cc262e3L    # 5.015878305459066E214

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    const-string v2, "touchInfoList"

    .line 193
    .line 194
    const/4 v3, 0x7

    .line 195
    const-wide v4, 0x4009bc1d9bd4d2c3L    # 3.216853349144317

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method private static buildEntityTouchInfoEntity(Lio/objectbox/e;)V
    .locals 10

    .line 1
    const-string v0, "TouchInfoEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0xd

    .line 8
    .line 9
    const-wide v1, 0x6c829fd26cc262e3L    # 5.015878305459066E214

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    const-wide v1, 0x491e404c40d362ffL    # 1.686558724709029E44

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const-string v3, "id"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {p0, v0, v3, v4, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-wide v5, 0x1e78d312279a2a16L    # 6.897358146423168E-162

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    invoke-virtual {v3, v7, v5, v6}, Lio/objectbox/d;->c(IJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v7}, Lio/objectbox/d;->b(I)V

    .line 46
    .line 47
    .line 48
    const-string v3, "eventTime"

    .line 49
    .line 50
    invoke-virtual {p0, v0, v3, v4, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/4 v5, 0x2

    .line 55
    const-wide v6, 0x148f0a2a0b22fbbfL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x4

    .line 64
    invoke-virtual {v3, v5}, Lio/objectbox/d;->b(I)V

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x7

    .line 68
    const-string v6, "x"

    .line 69
    .line 70
    invoke-virtual {p0, v3, v6, v4, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const/4 v7, 0x3

    .line 75
    const-wide v8, 0x32ecd78e06d67ea7L    # 2.1909701478257338E-63

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v5}, Lio/objectbox/d;->b(I)V

    .line 84
    .line 85
    .line 86
    const-string v6, "y"

    .line 87
    .line 88
    invoke-virtual {p0, v3, v6, v4, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const-wide v6, 0x24f145338f9bb7dfL    # 9.732450982048126E-131

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v5}, Lio/objectbox/d;->b(I)V

    .line 101
    .line 102
    .line 103
    const-string v3, "record"

    .line 104
    .line 105
    const/16 v4, 0xb

    .line 106
    .line 107
    const-string v5, "recordId"

    .line 108
    .line 109
    const-string v6, "TouchEventEntity"

    .line 110
    .line 111
    invoke-virtual {p0, v4, v5, v6, v3}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->c(IJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Lio/objectbox/d;->a()V

    .line 119
    .line 120
    .line 121
    const/16 v0, 0x60c

    .line 122
    .line 123
    iput v0, v3, Lio/objectbox/d;->f:I

    .line 124
    .line 125
    const/16 v0, 0x1e

    .line 126
    .line 127
    const-wide v1, 0x46e5b296e7d5355L

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0, v1, v2}, Lio/objectbox/d;->d(IJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lio/objectbox/c;->c()V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method private static buildEntityTouchRecordEntity(Lio/objectbox/e;)V
    .locals 10

    .line 1
    const-string v0, "TouchRecordEntity"

    .line 2
    .line 3
    invoke-static {p0, p0, v0}, Landroidx/compose/material3/c;->h(Lio/objectbox/e;Lio/objectbox/e;Ljava/lang/String;)Lio/objectbox/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-wide v2, 0x4e95758bd0ff0296L    # 3.70264278568057E70

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 p0, 0xa

    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lio/objectbox/c;->e(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const-wide v2, 0x2f3a0f94d35f7116L    # 3.434234921345545E-81

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0, v2, v3}, Lio/objectbox/c;->f(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/c;->d()V

    .line 27
    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    const-string v5, "id"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-wide v7, 0x1eb86a06dbbd53d4L    # 1.085336072891423E-160

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    invoke-virtual {v4, v5, v7, v8}, Lio/objectbox/d;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v5}, Lio/objectbox/d;->b(I)V

    .line 47
    .line 48
    .line 49
    const/16 v4, 0x9

    .line 50
    .line 51
    const-string v5, "fileName"

    .line 52
    .line 53
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const/4 v7, 0x2

    .line 58
    const-wide v8, 0x20a67e62fdff0224L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->c(IJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5}, Lio/objectbox/d;->a()V

    .line 67
    .line 68
    .line 69
    const/16 v7, 0x820

    .line 70
    .line 71
    iput v7, v5, Lio/objectbox/d;->f:I

    .line 72
    .line 73
    const/16 v7, 0x18

    .line 74
    .line 75
    const-wide v8, 0xa61d0c8e12a66faL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v7, v8, v9}, Lio/objectbox/d;->d(IJ)V

    .line 81
    .line 82
    .line 83
    const-string v5, "validate"

    .line 84
    .line 85
    invoke-virtual {v1, v4, v5, v6, v6}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const/4 v5, 0x3

    .line 90
    const-wide v6, 0xfedb1784136fcdaL    # 5.976830748995733E-232

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v5, v6, v7}, Lio/objectbox/d;->c(IJ)V

    .line 96
    .line 97
    .line 98
    const-string v4, "record"

    .line 99
    .line 100
    const/16 v5, 0xb

    .line 101
    .line 102
    const-string v6, "recordId"

    .line 103
    .line 104
    const-string v7, "RecordEntity"

    .line 105
    .line 106
    invoke-virtual {v1, v5, v6, v7, v4}, Lio/objectbox/c;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4, v0, v2, v3}, Lio/objectbox/d;->c(IJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Lio/objectbox/d;->a()V

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x60c

    .line 117
    .line 118
    iput v0, v4, Lio/objectbox/d;->f:I

    .line 119
    .line 120
    const-wide v2, 0x625e2661f93f6869L    # 6.944867688637747E165

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, p0, v2, v3}, Lio/objectbox/d;->d(IJ)V

    .line 126
    .line 127
    .line 128
    const/4 v6, 0x4

    .line 129
    const-wide v7, 0x273e2eef06fdc26dL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    const-string v2, "touchEventList"

    .line 135
    .line 136
    const/4 v3, 0x4

    .line 137
    const-wide v4, 0x5a4b76a6955454c2L    # 9.295307240696297E126

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v1 .. v8}, Lio/objectbox/c;->h(Ljava/lang/String;IJIJ)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lio/objectbox/c;->c()V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public static builder()Lio/objectbox/b;
    .locals 2

    .line 1
    new-instance v0, Lio/objectbox/b;

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->getModel()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lio/objectbox/b;-><init>([B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity_;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity_;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 58
    .line 59
    .line 60
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 68
    .line 69
    .line 70
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 73
    .line 74
    .line 75
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 98
    .line 99
    .line 100
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 108
    .line 109
    .line 110
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 118
    .line 119
    .line 120
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity_;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 123
    .line 124
    .line 125
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lio/objectbox/b;->d(Lio/objectbox/EntityInfo;)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method

.method private static getModel()[B
    .locals 10

    .line 1
    new-instance v0, Lio/objectbox/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/objectbox/e;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, Lio/objectbox/e;->c:Ljava/lang/Integer;

    .line 13
    .line 14
    const-wide v1, 0x582ed697b92bdf72L    # 6.075445102957898E116

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lio/objectbox/e;->d:Ljava/lang/Long;

    .line 24
    .line 25
    const/16 v1, 0x25

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, v0, Lio/objectbox/e;->e:Ljava/lang/Integer;

    .line 32
    .line 33
    const-wide v1, 0x7ca10aec1c1127b1L    # 2.125902392634659E292

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, v0, Lio/objectbox/e;->f:Ljava/lang/Long;

    .line 43
    .line 44
    const/16 v1, 0xb

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, v0, Lio/objectbox/e;->g:Ljava/lang/Integer;

    .line 51
    .line 52
    const-wide v1, 0x529d5f6ce8517dbeL    # 9.348962464412136E89

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, v0, Lio/objectbox/e;->h:Ljava/lang/Long;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityFileInfoEntity(Lio/objectbox/e;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityTextInfoEntity(Lio/objectbox/e;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityPageEntity(Lio/objectbox/e;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityFileRecordEntity(Lio/objectbox/e;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityTouchInfoEntity(Lio/objectbox/e;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityAudioRecordEntity(Lio/objectbox/e;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityBackgroundLineConfigEntity(Lio/objectbox/e;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityCommandInfoEntity(Lio/objectbox/e;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityMatrixEventEntity(Lio/objectbox/e;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityAudioInfoEntity(Lio/objectbox/e;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityMoveConfigEntity(Lio/objectbox/e;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityTouchEventEntity(Lio/objectbox/e;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityCommandRecordEntity(Lio/objectbox/e;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityGeometryPointFEntity(Lio/objectbox/e;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityMatrixInfoEntity(Lio/objectbox/e;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityRecordEntity(Lio/objectbox/e;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityTextRecordEntity(Lio/objectbox/e;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityBlackBoardEntity(Lio/objectbox/e;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityMatrixRecordEntity(Lio/objectbox/e;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityTouchRecordEntity(Lio/objectbox/e;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityAuthorEntity(Lio/objectbox/e;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityGeometryInfoEntity(Lio/objectbox/e;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityGeometryRecordEntity(Lio/objectbox/e;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lcom/zykj/blackboard/core/data/dao/MyObjectBox;->buildEntityHeaderEntity(Lio/objectbox/e;)V

    .line 133
    .line 134
    .line 135
    const-string v1, "default"

    .line 136
    .line 137
    iget-object v2, v0, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v3, v0, Lio/objectbox/e;->b:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Lio/objectbox/e;->a(Ljava/util/List;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/16 v4, 0x9

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Lcom/google/flatbuffers/a;->l(I)V

    .line 152
    .line 153
    .line 154
    const/4 v4, 0x1

    .line 155
    invoke-virtual {v2, v4, v1}, Lcom/google/flatbuffers/a;->b(II)V

    .line 156
    .line 157
    .line 158
    const-wide/16 v5, 0x2

    .line 159
    .line 160
    long-to-int v1, v5

    .line 161
    const/4 v5, 0x0

    .line 162
    invoke-virtual {v2, v5, v1}, Lcom/google/flatbuffers/a;->a(II)V

    .line 163
    .line 164
    .line 165
    iget-boolean v1, v2, Lcom/google/flatbuffers/a;->l:Z

    .line 166
    .line 167
    const/16 v1, 0x8

    .line 168
    .line 169
    invoke-virtual {v2, v1, v5}, Lcom/google/flatbuffers/a;->h(II)V

    .line 170
    .line 171
    .line 172
    iget-object v6, v2, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    iget v7, v2, Lcom/google/flatbuffers/a;->b:I

    .line 175
    .line 176
    sub-int/2addr v7, v1

    .line 177
    iput v7, v2, Lcom/google/flatbuffers/a;->b:I

    .line 178
    .line 179
    const-wide/16 v8, 0x1

    .line 180
    .line 181
    invoke-virtual {v6, v7, v8, v9}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    .line 184
    const/4 v1, 0x2

    .line 185
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 186
    .line 187
    .line 188
    const/4 v1, 0x3

    .line 189
    invoke-virtual {v2, v1, v3}, Lcom/google/flatbuffers/a;->b(II)V

    .line 190
    .line 191
    .line 192
    iget-object v1, v0, Lio/objectbox/e;->c:Ljava/lang/Integer;

    .line 193
    .line 194
    const/4 v3, 0x4

    .line 195
    if-eqz v1, :cond_0

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    int-to-long v6, v1

    .line 202
    iget-object v1, v0, Lio/objectbox/e;->d:Ljava/lang/Long;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 205
    .line 206
    .line 207
    move-result-wide v8

    .line 208
    invoke-static {v2, v6, v7, v8, v9}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual {v2, v3, v1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 213
    .line 214
    .line 215
    :cond_0
    iget-object v1, v0, Lio/objectbox/e;->e:Ljava/lang/Integer;

    .line 216
    .line 217
    if-eqz v1, :cond_1

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    int-to-long v6, v1

    .line 224
    iget-object v1, v0, Lio/objectbox/e;->f:Ljava/lang/Long;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 227
    .line 228
    .line 229
    move-result-wide v8

    .line 230
    invoke-static {v2, v6, v7, v8, v9}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const/4 v6, 0x5

    .line 235
    invoke-virtual {v2, v6, v1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 236
    .line 237
    .line 238
    :cond_1
    iget-object v1, v0, Lio/objectbox/e;->g:Ljava/lang/Integer;

    .line 239
    .line 240
    if-eqz v1, :cond_2

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    int-to-long v6, v1

    .line 247
    iget-object v0, v0, Lio/objectbox/e;->h:Ljava/lang/Long;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 250
    .line 251
    .line 252
    move-result-wide v0

    .line 253
    invoke-static {v2, v6, v7, v0, v1}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    const/4 v1, 0x7

    .line 258
    invoke-virtual {v2, v1, v0}, Lcom/google/flatbuffers/a;->d(II)V

    .line 259
    .line 260
    .line 261
    :cond_2
    invoke-virtual {v2}, Lcom/google/flatbuffers/a;->f()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    iget v1, v2, Lcom/google/flatbuffers/a;->c:I

    .line 266
    .line 267
    invoke-virtual {v2, v1, v3}, Lcom/google/flatbuffers/a;->h(II)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v3, v5}, Lcom/google/flatbuffers/a;->h(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Lcom/google/flatbuffers/a;->g()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    sub-int/2addr v1, v0

    .line 278
    add-int/2addr v1, v3

    .line 279
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/a;->i(I)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v2, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 283
    .line 284
    iget v1, v2, Lcom/google/flatbuffers/a;->b:I

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 287
    .line 288
    .line 289
    iput-boolean v4, v2, Lcom/google/flatbuffers/a;->g:Z

    .line 290
    .line 291
    invoke-virtual {v2}, Lcom/google/flatbuffers/a;->j()[B

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0
.end method
