.class final Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->v(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.sync.SyncStateOne$prepareNewNoteForSync$2"
    f = "SyncStateOne.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;

.field public final synthetic g:Lcom/friday/document/sync/SyncStateOne;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->g:Lcom/friday/document/sync/SyncStateOne;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->g:Lcom/friday/document/sync/SyncStateOne;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->e:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/io/File;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v6, Ljava/io/File;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 59
    .line 60
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 61
    .line 62
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-direct {p1, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Ljava/util/Date;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    sget-object p1, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v3, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2$1;

    .line 85
    .line 86
    iget-object v4, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->g:Lcom/friday/document/sync/SyncStateOne;

    .line 87
    .line 88
    iget-object v5, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 89
    .line 90
    const/4 v8, 0x0

    .line 91
    invoke-direct/range {v3 .. v8}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/lang/String;Lvc/c;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    iput-object v4, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->c:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iput-object v4, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->d:Ljava/lang/Object;

    .line 105
    .line 106
    iput v2, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->e:I

    .line 107
    .line 108
    invoke-virtual {p1, v1, v3, p0}, Lcom/friday/common/helper/NotePageOrder;->e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_2

    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_2
    :goto_0
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_3
    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;->f:Lcom/friday/common/entity/FileEntity;

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, "\u9875\u9762 SyncStateOne.kt -> prepareNewNoteForSync\uff0c\u65b0\u4e91\u7b14\u8bb0\u672c\u5730\u76ee\u5f55\u4e0d\u5b58\u5728\uff0c\u6587\u4ef6id="

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, "\uff0c\u76ee\u5f55="

    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 165
    .line 166
    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->d:Lcom/friday/common/util/SyncException$Kind;

    .line 167
    .line 168
    const-string v1, "\u65b0\u4e91\u7b14\u8bb0\u672c\u5730\u76ee\u5f55\u4e0d\u5b58\u5728"

    .line 169
    .line 170
    invoke-direct {p1, v0, v1}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1
.end method
