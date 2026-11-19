.class public final synthetic Lh4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lcom/friday/user/view/AboutFragment;


# direct methods
.method public synthetic constructor <init>(ZLcom/friday/user/view/AboutFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lh4/b;->c:Z

    iput-object p2, p0, Lh4/b;->d:Lcom/friday/user/view/AboutFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh4/b;->c:Z

    iget-object v1, p0, Lh4/b;->d:Lcom/friday/user/view/AboutFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/friday/user/view/AboutFragment;->s(ZLcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
