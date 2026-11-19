.class public final synthetic Lq4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:I

.field public final synthetic e:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;Lcom/zykj/mistake/fragment/TypicalAnswerFragment;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq4/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq4/m;->d:I

    iput-object p2, p0, Lq4/m;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lq4/m;->b:Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

    iput-object p4, p0, Lq4/m;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/fragment/TypicalAnswerFragment;Ljava/util/ArrayList;ILjava/util/ArrayList;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lq4/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4/m;->b:Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

    iput-object p2, p0, Lq4/m;->c:Ljava/util/ArrayList;

    iput p3, p0, Lq4/m;->d:I

    iput-object p4, p0, Lq4/m;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lq4/m;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq4/m;->c:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget v0, p0, Lq4/m;->d:I

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lq4/m;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p0, Lq4/m;->b:Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p0, Lq4/m;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v1, p0, Lq4/m;->d:I

    .line 37
    .line 38
    iget-object v2, p0, Lq4/m;->b:Lcom/zykj/mistake/fragment/TypicalAnswerFragment;

    .line 39
    .line 40
    iget-object v3, p0, Lq4/m;->e:Ljava/util/ArrayList;

    .line 41
    .line 42
    if-ge v1, v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v2, v0, p1}, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {v2, p1, v0}, Lcom/zykj/mistake/fragment/TypicalAnswerFragment;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
