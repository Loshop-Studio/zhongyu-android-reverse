.class Lcom/tendcloud/tenddata/dw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/dw;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/dw;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/dw;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/dw$1;->this$0:Lcom/tendcloud/tenddata/dw;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/es;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/tendcloud/tenddata/es;->reflectMSA(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/dw;->a:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/tendcloud/tenddata/fr;->a()Lcom/tendcloud/tenddata/fr;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fr;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :catchall_0
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/tendcloud/tenddata/ey;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/tendcloud/tenddata/ey;->reflectMiUi(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v0}, Lcom/tendcloud/tenddata/ep;->a(Landroid/content/Context;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/tendcloud/tenddata/ep;->bindHWServiceGetOAID(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 66
    .line 67
    invoke-static {v0}, Lcom/tendcloud/tenddata/ew;->a(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {v0}, Lcom/tendcloud/tenddata/ew;->bindSECServiceGetOAID(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {v0}, Lcom/tendcloud/tenddata/ev;->a(Landroid/content/Context;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 89
    .line 90
    invoke-static {v0}, Lcom/tendcloud/tenddata/ev;->bindOPPOServiceGetOAID(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 95
    .line 96
    invoke-static {v0}, Lcom/tendcloud/tenddata/eu;->a(Landroid/content/Context;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 103
    .line 104
    invoke-static {v0}, Lcom/tendcloud/tenddata/eu;->bindONEPLUSServiceGetOAID(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    invoke-static {}, Lcom/tendcloud/tenddata/ex;->a()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {v0}, Lcom/tendcloud/tenddata/ex;->reflectVIVO(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 121
    .line 122
    invoke-static {v0}, Lcom/tendcloud/tenddata/eo;->a(Landroid/content/Context;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {v0}, Lcom/tendcloud/tenddata/eo;->bindASUSServiceGetOAID(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 135
    .line 136
    invoke-static {v0}, Lcom/tendcloud/tenddata/er;->a(Landroid/content/Context;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {v0}, Lcom/tendcloud/tenddata/er;->reflectMEiZU(Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_8
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 149
    .line 150
    invoke-static {v0}, Lcom/tendcloud/tenddata/ez;->a(Landroid/content/Context;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 157
    .line 158
    invoke-static {v0}, Lcom/tendcloud/tenddata/ez;->bindZTEServiceGetOAID(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_9
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 163
    .line 164
    invoke-static {v0}, Lcom/tendcloud/tenddata/eq;->a(Landroid/content/Context;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 171
    .line 172
    invoke-static {v0}, Lcom/tendcloud/tenddata/eq;->bindLENOVOServiceGetOAID(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_a
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 177
    .line 178
    invoke-static {v0}, Lcom/tendcloud/tenddata/et;->a(Landroid/content/Context;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    iget-object v0, p0, Lcom/tendcloud/tenddata/dw$1;->val$context:Landroid/content/Context;

    .line 185
    .line 186
    invoke-static {v0}, Lcom/tendcloud/tenddata/et;->reflectNUBIA(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 187
    .line 188
    .line 189
    :catchall_1
    :cond_b
    :goto_0
    return-void
.end method
