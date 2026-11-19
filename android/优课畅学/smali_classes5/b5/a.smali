.class public final synthetic Lb5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/a;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/a;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;->i(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
