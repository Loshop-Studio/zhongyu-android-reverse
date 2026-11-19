.class public final synthetic Lcom/zykj/mistake/activity/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/p;->a:I

    iput-object p3, p0, Lcom/zykj/mistake/activity/p;->b:Ljava/lang/Object;

    iput p1, p0, Lcom/zykj/mistake/activity/p;->c:I

    iput-object p4, p0, Lcom/zykj/mistake/activity/p;->d:Ljava/lang/Object;

    iput-object p5, p0, Lcom/zykj/mistake/activity/p;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/activity/p;->a:I

    .line 4
    .line 5
    const-string v2, ".jpg"

    .line 6
    .line 7
    sget-object v3, Ld6/s;->a:Ld6/s;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/zykj/mistake/activity/p;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/zykj/mistake/activity/p;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/zykj/mistake/activity/p;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, Li7/b;

    .line 19
    .line 20
    check-cast v5, Ljava/util/Map;

    .line 21
    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, Landroidx/navigation/NavArgumentBuilder;

    .line 27
    .line 28
    iget v2, v0, Lcom/zykj/mistake/activity/p;->c:I

    .line 29
    .line 30
    invoke-static {v6, v2, v5, v4, v1}, Landroidx/navigation/serialization/RouteSerializerKt;->c(Li7/b;ILjava/util/Map;Ljava/lang/String;Landroidx/navigation/NavArgumentBuilder;)Ld6/s;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    return-object v1

    .line 35
    :pswitch_0
    check-cast v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 36
    .line 37
    move-object v9, v5

    .line 38
    check-cast v9, Landroid/widget/ImageView;

    .line 39
    .line 40
    move-object v10, v4

    .line 41
    check-cast v10, Landroid/widget/ImageView;

    .line 42
    .line 43
    move-object/from16 v7, p1

    .line 44
    .line 45
    check-cast v7, Landroid/net/Uri;

    .line 46
    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    sget v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v5, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->l:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    iget v8, v0, Lcom/zykj/mistake/activity/p;->c:I

    .line 60
    .line 61
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v4, v6

    .line 72
    move-object v6, v1

    .line 73
    invoke-virtual/range {v4 .. v10}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->B(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ILandroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-object v3

    .line 77
    :pswitch_1
    move-object v11, v6

    .line 78
    check-cast v11, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 79
    .line 80
    move-object/from16 v16, v5

    .line 81
    .line 82
    check-cast v16, Landroid/widget/ImageView;

    .line 83
    .line 84
    move-object/from16 v17, v4

    .line 85
    .line 86
    check-cast v17, Landroid/widget/ImageView;

    .line 87
    .line 88
    move-object/from16 v14, p1

    .line 89
    .line 90
    check-cast v14, Landroid/net/Uri;

    .line 91
    .line 92
    if-nez v14, :cond_1

    .line 93
    .line 94
    sget v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget-object v12, v11, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->l:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    iget v15, v0, Lcom/zykj/mistake/activity/p;->c:I

    .line 105
    .line 106
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    invoke-virtual/range {v11 .. v17}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->B(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ILandroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 117
    .line 118
    .line 119
    :goto_1
    return-object v3

    .line 120
    :pswitch_2
    move-object v7, v6

    .line 121
    check-cast v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 122
    .line 123
    move-object v8, v5

    .line 124
    check-cast v8, Landroid/widget/ImageView;

    .line 125
    .line 126
    move-object v9, v4

    .line 127
    check-cast v9, Landroid/widget/ImageView;

    .line 128
    .line 129
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, Landroid/net/Uri;

    .line 132
    .line 133
    sget v2, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 134
    .line 135
    const-string v2, "uri"

    .line 136
    .line 137
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v7, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->k:Lcom/zykj/view/utils/ImagePicker;

    .line 141
    .line 142
    new-instance v4, Lcom/zykj/mistake/activity/p;

    .line 143
    .line 144
    const/4 v6, 0x1

    .line 145
    iget v5, v0, Lcom/zykj/mistake/activity/p;->c:I

    .line 146
    .line 147
    invoke-direct/range {v4 .. v9}, Lcom/zykj/mistake/activity/p;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v1, v4}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 151
    .line 152
    .line 153
    return-object v3

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
