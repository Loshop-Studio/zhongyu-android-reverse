.class public final synthetic Lb5/j5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeachDetailsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/j5;->a:Lcom/zykj/study/ui/home/my/TeachDetailsFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/j5;->a:Lcom/zykj/study/ui/home/my/TeachDetailsFragment;

    check-cast p1, Lcom/zykj/study/bean/teach/CourseProgress;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->h(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
