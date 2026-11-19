.class public final Lcom/tencent/bugly/proguard/b1;
.super Landroid/os/FileObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/tencent/bugly/proguard/ay;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ay;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/bugly/proguard/b1;->a:I

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b1;->b:Lcom/tencent/bugly/proguard/ay;

    const/16 p1, 0x8

    const-string v0, "/data/anr/"

    invoke-direct {p0, v0, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/ay;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/b1;->a:I

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b1;->b:Lcom/tencent/bugly/proguard/ay;

    const/16 p1, 0x8

    invoke-direct {p0, p2, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final onEvent(ILjava/lang/String;)V
    .locals 6

    .line 1
    iget p1, p0, Lcom/tencent/bugly/proguard/b1;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b1;->b:Lcom/tencent/bugly/proguard/ay;

    .line 11
    .line 12
    iget-object v0, p1, Lcom/tencent/bugly/proguard/ay;->e:Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "observe file, dir:%s fileName:%s"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/al;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    const-string v0, "manual_bugly_trace_"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const-string v1, ".txt"

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    iget-object v3, p1, Lcom/tencent/bugly/proguard/ay;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const-string p1, "proc is not in anr, just ignore"

    .line 49
    .line 50
    new-array p2, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v3, p1, Lcom/tencent/bugly/proguard/ay;->c:Lcom/tencent/bugly/proguard/aa;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/aa;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const-string v4, "/"

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    const-string v3, "Found foreground anr, resend sigquit immediately."

    .line 67
    .line 68
    new-array v5, v2, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v3, v5}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->resendSigquit()V

    .line 78
    .line 79
    .line 80
    invoke-static {p2, v0, v1}, Lcom/tencent/bugly/proguard/am;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-object v5, p1, Lcom/tencent/bugly/proguard/ay;->e:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v3, v5, v4, p2}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-static {p1, v0, v1, p2}, Lcom/tencent/bugly/proguard/ay;->a(Lcom/tencent/bugly/proguard/ay;JLjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string p1, "Finish handling one anr."

    .line 99
    .line 100
    new-array p2, v2, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    const-string v3, "Found background anr, resend sigquit later."

    .line 107
    .line 108
    new-array v5, v2, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v3, v5}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    invoke-static {p2, v0, v1}, Lcom/tencent/bugly/proguard/am;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    new-instance v3, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-object v5, p1, Lcom/tencent/bugly/proguard/ay;->e:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v3, v5, v4, p2}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {p1, v0, v1, p2}, Lcom/tencent/bugly/proguard/ay;->a(Lcom/tencent/bugly/proguard/ay;JLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string p1, "Finish handling one anr, now resend sigquit."

    .line 132
    .line 133
    new-array p2, v2, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->resendSigquit()V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_3
    const-string p1, "not manual trace file, ignore."

    .line 147
    .line 148
    new-array p2, v2, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :goto_0
    return-void

    .line 154
    :pswitch_0
    if-nez p2, :cond_4

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_4
    const-string p1, "/data/anr/"

    .line 158
    .line 159
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string p2, "watching file %s"

    .line 164
    .line 165
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p2, v0}, Lcom/tencent/bugly/proguard/al;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    const-string p2, "trace"

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-nez p2, :cond_5

    .line 179
    .line 180
    const-string p2, "not anr file %s"

    .line 181
    .line 182
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/al;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/b1;->b:Lcom/tencent/bugly/proguard/ay;

    .line 191
    .line 192
    iget-object p2, p2, Lcom/tencent/bugly/proguard/ay;->d:Lcom/tencent/bugly/proguard/ak;

    .line 193
    .line 194
    new-instance v0, Lcom/blankj/utilcode/util/a0;

    .line 195
    .line 196
    const/4 v1, 0x3

    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/blankj/utilcode/util/a0;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v0}, Lcom/tencent/bugly/proguard/ak;->a(Ljava/lang/Runnable;)Z

    .line 202
    .line 203
    .line 204
    :goto_1
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
