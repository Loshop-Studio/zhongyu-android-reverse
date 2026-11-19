.class public final synthetic Lcom/zykj/student/dialogue/ui/home/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/b;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/g;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/g;->b:Lcom/zykj/student/dialogue/ui/home/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/g;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/g;->b:Lcom/zykj/student/dialogue/ui/home/b;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->a(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
