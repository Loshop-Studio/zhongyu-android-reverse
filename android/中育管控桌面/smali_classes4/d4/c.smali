.class public final synthetic Ld4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/c;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ld4/c;->b:Ljava/lang/String;

    iput-object p3, p0, Ld4/c;->c:Ljava/lang/String;

    iput-object p4, p0, Ld4/c;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ld4/c;->e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    iput-boolean p6, p0, Ld4/c;->f:Z

    iput-boolean p7, p0, Ld4/c;->g:Z

    iput-object p8, p0, Ld4/c;->h:Ljava/lang/String;

    iput p9, p0, Ld4/c;->i:I

    iput p10, p0, Ld4/c;->j:I

    iput p11, p0, Ld4/c;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Ld4/c;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ld4/c;->b:Ljava/lang/String;

    iget-object v2, p0, Ld4/c;->c:Ljava/lang/String;

    iget-object v3, p0, Ld4/c;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ld4/c;->e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    iget-boolean v5, p0, Ld4/c;->f:Z

    iget-boolean v6, p0, Ld4/c;->g:Z

    iget-object v7, p0, Ld4/c;->h:Ljava/lang/String;

    iget v8, p0, Ld4/c;->i:I

    iget v9, p0, Ld4/c;->j:I

    iget v10, p0, Ld4/c;->k:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
