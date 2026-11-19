.class public final synthetic Ls6/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/p1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/p1;->a:Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;->h(Lcom/zykj/student/dialogue/ui/home/HomePagerFragment;)Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    move-result-object v0

    return-object v0
.end method
