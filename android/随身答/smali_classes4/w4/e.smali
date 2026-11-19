.class public final Lw4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/e$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/blackboard/core/action/WritingAction;

.field public final b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

.field public final c:Lcom/zykj/blackboard/core/action/SelectAction;

.field public final d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

.field public final e:Lw4/d;

.field public final f:Lcom/zykj/blackboard/core/action/TextAction;

.field public final g:Lcom/zykj/blackboard/core/action/CursorAction;

.field public final h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

.field public final i:Lcom/zykj/blackboard/core/action/GeometryAction;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/blackboard/core/action/WritingAction;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/WritingAction;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/WriteBeelineAction;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lw4/e;->b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 17
    .line 18
    new-instance v0, Lcom/zykj/blackboard/core/action/SelectAction;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/SelectAction;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lw4/e;->c:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/EraseWritingAction;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lw4/e;->d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 31
    .line 32
    new-instance v0, Lw4/d;

    .line 33
    .line 34
    invoke-direct {v0}, Lw4/d;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lw4/e;->e:Lw4/d;

    .line 38
    .line 39
    new-instance v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 40
    .line 41
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/TextAction;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lw4/e;->f:Lcom/zykj/blackboard/core/action/TextAction;

    .line 45
    .line 46
    new-instance v0, Lcom/zykj/blackboard/core/action/CursorAction;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/CursorAction;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lw4/e;->g:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 52
    .line 53
    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lw4/e;->h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 59
    .line 60
    new-instance v0, Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 61
    .line 62
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/GeometryAction;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lw4/e;->i:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    .line 1
    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lw4/b;)Lw4/c;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lw4/b;->k()Lv4/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lv4/b;->y()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lw4/e$a;->a:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object p1, p0, Lw4/e;->i:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->I()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lw4/e;->i:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    iget-object p1, p0, Lw4/e;->h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->U()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lw4/e;->h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_2
    iget-object p1, p0, Lw4/e;->g:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/CursorAction;->P()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lw4/e;->g:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_3
    iget-object p1, p0, Lw4/e;->f:Lcom/zykj/blackboard/core/action/TextAction;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->i0()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lw4/e;->f:Lcom/zykj/blackboard/core/action/TextAction;

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_4
    iget-object p1, p0, Lw4/e;->e:Lw4/d;

    .line 60
    .line 61
    invoke-virtual {p1}, Lw4/d;->I()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lw4/e;->e:Lw4/d;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_5
    iget-object p1, p0, Lw4/e;->d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->T()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lw4/e;->d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_6
    iget-object p1, p0, Lw4/e;->b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->f0()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lw4/e;->b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_7
    iget-object p1, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->f0()V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_8
    iget-object p1, p0, Lw4/e;->c:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/SelectAction;->W()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lw4/e;->c:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lw4/b;)Lw4/c;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lw4/b;->k()Lv4/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lv4/b;->y()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lw4/e$a;->a:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object p1, p0, Lw4/e;->i:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    iget-object p1, p0, Lw4/e;->h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    iget-object p1, p0, Lw4/e;->g:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    iget-object p1, p0, Lw4/e;->f:Lcom/zykj/blackboard/core/action/TextAction;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_4
    iget-object p1, p0, Lw4/e;->e:Lw4/d;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_5
    iget-object p1, p0, Lw4/e;->d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_6
    iget-object p1, p0, Lw4/e;->b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_7
    iget-object p1, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_8
    iget-object p1, p0, Lw4/e;->c:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 52
    .line 53
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lcom/zykj/blackboard/core/action/WritingAction;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lw4/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw4/e;->a:Lcom/zykj/blackboard/core/action/WritingAction;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw4/e;->b:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lw4/e;->c:Lcom/zykj/blackboard/core/action/SelectAction;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lw4/e;->d:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lw4/e;->e:Lw4/d;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lw4/e;->f:Lcom/zykj/blackboard/core/action/TextAction;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lw4/e;->g:Lcom/zykj/blackboard/core/action/CursorAction;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lw4/e;->h:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->k(Lw4/b;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lw4/e;->i:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
