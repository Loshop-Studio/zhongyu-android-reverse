.class public final synthetic Lv3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;Ljava/lang/String;FZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/b0;->c:Lcom/friday/main/view/DBActivity;

    iput-object p2, p0, Lv3/b0;->d:Ljava/lang/String;

    iput p3, p0, Lv3/b0;->e:F

    iput-boolean p4, p0, Lv3/b0;->f:Z

    iput p5, p0, Lv3/b0;->g:I

    iput p6, p0, Lv3/b0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lv3/b0;->c:Lcom/friday/main/view/DBActivity;

    iget-object v1, p0, Lv3/b0;->d:Ljava/lang/String;

    iget v2, p0, Lv3/b0;->e:F

    iget-boolean v3, p0, Lv3/b0;->f:Z

    iget v4, p0, Lv3/b0;->g:I

    iget v5, p0, Lv3/b0;->h:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/friday/main/view/DBActivity;->c0(Lcom/friday/main/view/DBActivity;Ljava/lang/String;FZIILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
