.class public final synthetic Lb5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/t;->a:Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/t;->a:Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;->h(Lcom/zykj/study/ui/home/my/CourseManageDialogFragment;JZ)Lh7/p;

    move-result-object p1

    return-object p1
.end method
