.class public final synthetic Lcom/zykj/student/dialogue/ui/home/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/b;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/m;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/m;->b:Lcom/zykj/student/dialogue/ui/home/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/m;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/m;->b:Lcom/zykj/student/dialogue/ui/home/b;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment$onViewCreated$1$1$4$1;->a(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;Lcom/zykj/student/dialogue/ui/home/b;J)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
