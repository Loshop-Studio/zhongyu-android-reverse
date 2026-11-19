.class public final synthetic Ls6/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/z0;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iput-object p2, p0, Ls6/z0;->b:Lcom/zykj/student/dialogue/ui/home/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/z0;->a:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    iget-object v1, p0, Ls6/z0;->b:Lcom/zykj/student/dialogue/ui/home/a;

    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/FilterType;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->t(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/a;Lcom/zykj/student/dialogue/bean/resp/FilterType;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
