.class public final synthetic Lq3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/b;->a:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    iput p2, p0, Lq3/b;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq3/b;->a:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    iget v1, p0, Lq3/b;->b:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/a;->g(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;ILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
