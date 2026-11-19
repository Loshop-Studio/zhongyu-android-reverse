.class public final synthetic Lc5/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/p;

.field public final synthetic e:Landroidx/compose/foundation/text/KeyboardOptions;

.field public final synthetic f:Lx7/l;

.field public final synthetic g:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic h:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lx7/l;Lx7/p;Landroidx/compose/foundation/text/KeyboardOptions;Lx7/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/i0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc5/i0;->b:Ljava/lang/String;

    iput-object p3, p0, Lc5/i0;->c:Lx7/l;

    iput-object p4, p0, Lc5/i0;->d:Lx7/p;

    iput-object p5, p0, Lc5/i0;->e:Landroidx/compose/foundation/text/KeyboardOptions;

    iput-object p6, p0, Lc5/i0;->f:Lx7/l;

    iput-object p7, p0, Lc5/i0;->g:Landroidx/compose/ui/text/TextStyle;

    iput-object p8, p0, Lc5/i0;->h:Landroidx/compose/ui/text/TextStyle;

    iput p9, p0, Lc5/i0;->i:I

    iput p10, p0, Lc5/i0;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lc5/i0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc5/i0;->b:Ljava/lang/String;

    iget-object v2, p0, Lc5/i0;->c:Lx7/l;

    iget-object v3, p0, Lc5/i0;->d:Lx7/p;

    iget-object v4, p0, Lc5/i0;->e:Landroidx/compose/foundation/text/KeyboardOptions;

    iget-object v5, p0, Lc5/i0;->f:Lx7/l;

    iget-object v6, p0, Lc5/i0;->g:Landroidx/compose/ui/text/TextStyle;

    iget-object v7, p0, Lc5/i0;->h:Landroidx/compose/ui/text/TextStyle;

    iget v8, p0, Lc5/i0;->i:I

    iget v9, p0, Lc5/i0;->j:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lc5/j0;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lx7/l;Lx7/p;Landroidx/compose/foundation/text/KeyboardOptions;Lx7/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;IILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
