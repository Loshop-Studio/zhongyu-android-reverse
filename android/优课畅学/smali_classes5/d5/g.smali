.class public final synthetic Ld5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyProgressFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/g;->a:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/g;->a:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->o(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/lib/login/proto/UserBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
