.class public final synthetic Lo6/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/d0;->a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    iput-object p2, p0, Lo6/d0;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lo6/d0;->a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    iget-object v1, p0, Lo6/d0;->b:Lkotlin/jvm/functions/Function0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->g(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
