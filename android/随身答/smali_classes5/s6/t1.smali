.class public final synthetic Ls6/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/t1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/t1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->k(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;J)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
