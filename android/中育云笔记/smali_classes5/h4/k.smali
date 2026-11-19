.class public final synthetic Lh4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/user/view/HelpFragment;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/k;->c:Lcom/friday/user/view/HelpFragment;

    iput-object p2, p0, Lh4/k;->d:Ljava/lang/String;

    iput p3, p0, Lh4/k;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/k;->c:Lcom/friday/user/view/HelpFragment;

    iget-object v1, p0, Lh4/k;->d:Ljava/lang/String;

    iget v2, p0, Lh4/k;->e:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/friday/user/view/HelpFragment;->s(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
