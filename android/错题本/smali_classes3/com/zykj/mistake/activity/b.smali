.class public final synthetic Lcom/zykj/mistake/activity/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/b;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/b;->b:Lcom/zykj/mistake/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/b;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "result"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lcom/zykj/mistake/activity/b;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 8
    .line 9
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 15
    .line 16
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v1, :cond_7

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_7

    .line 30
    .line 31
    const-string v1, "EDIT_MISTAKE_DATA"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_7

    .line 38
    .line 39
    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Lcom/google/gson/g;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Lk1/a;

    .line 44
    .line 45
    const-class v5, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 46
    .line 47
    invoke-direct {v2, v5}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    const-string v2, "EDIT_MISTAKE_SUBJECT_NAME"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v1, v3

    .line 72
    :goto_0
    if-nez v1, :cond_1

    .line 73
    .line 74
    const-string v1, ""

    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    const-string v2, "EDIT_MISTAKE_TAGS"

    .line 83
    .line 84
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    new-instance v2, Lcom/google/gson/g;

    .line 91
    .line 92
    invoke-direct {v2}, Lcom/google/gson/g;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lcom/zykj/mistake/activity/MainActivity$a;

    .line 96
    .line 97
    invoke-direct {v5}, Lcom/zykj/mistake/activity/MainActivity$a;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v6, Lk1/a;

    .line 101
    .line 102
    iget-object v5, v5, Lk1/a;->b:Ljava/lang/reflect/Type;

    .line 103
    .line 104
    invoke-direct {v6, v5}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, p1, v6}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object p1, v3

    .line 115
    :goto_1
    if-nez p1, :cond_3

    .line 116
    .line 117
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 118
    .line 119
    :cond_3
    iget-object v2, v4, Lcom/zykj/mistake/activity/MainActivity;->m:Lw4/a;

    .line 120
    .line 121
    const-string v5, "routeInfrastructure"

    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    iget-object v2, v2, Lw4/a;->a:Lz4/e;

    .line 126
    .line 127
    iget-object v2, v2, Lz4/e;->f:Landroidx/navigation/serialization/b;

    .line 128
    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    invoke-virtual {v2, v0, v1, p1}, Landroidx/navigation/serialization/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    :cond_4
    iget-object p1, v4, Lcom/zykj/mistake/activity/MainActivity;->m:Lw4/a;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    iget-object p1, p1, Lw4/a;->a:Lz4/e;

    .line 139
    .line 140
    iput-object v3, p1, Lz4/e;->f:Landroidx/navigation/serialization/b;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v3

    .line 147
    :cond_6
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v3

    .line 151
    :cond_7
    :goto_2
    return-void

    .line 152
    :pswitch_0
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 153
    .line 154
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-ne p1, v1, :cond_9

    .line 162
    .line 163
    iget-object p1, v4, Lcom/zykj/mistake/activity/MainActivity;->f:Lr6/a;

    .line 164
    .line 165
    if-eqz p1, :cond_8

    .line 166
    .line 167
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    :cond_8
    iput-object v3, v4, Lcom/zykj/mistake/activity/MainActivity;->f:Lr6/a;

    .line 171
    .line 172
    :cond_9
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
