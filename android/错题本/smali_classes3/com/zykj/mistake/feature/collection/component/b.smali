.class public final synthetic Lcom/zykj/mistake/feature/collection/component/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic e:J

.field public final synthetic f:Lr6/c;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/b;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/component/b;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/component/b;->d:Landroidx/compose/ui/focus/FocusRequester;

    iput-wide p5, p0, Lcom/zykj/mistake/feature/collection/component/b;->e:J

    iput-object p7, p0, Lcom/zykj/mistake/feature/collection/component/b;->f:Lr6/c;

    iput p8, p0, Lcom/zykj/mistake/feature/collection/component/b;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/collection/component/b;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/component/b;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/component/b;->b:Ljava/lang/Integer;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/component/b;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/component/b;->d:Landroidx/compose/ui/focus/FocusRequester;

    .line 24
    .line 25
    iget-wide v4, p0, Lcom/zykj/mistake/feature/collection/component/b;->e:J

    .line 26
    .line 27
    iget-object v6, p0, Lcom/zykj/mistake/feature/collection/component/b;->f:Lr6/c;

    .line 28
    .line 29
    invoke-static/range {v0 .. v8}, Lcom/zykj/mistake/feature/collection/component/f;->c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1
.end method
