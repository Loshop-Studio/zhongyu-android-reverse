.class public final synthetic Lq3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lx7/l;

.field public final synthetic e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lx7/l;Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/i;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lq3/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lq3/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lq3/i;->d:Lx7/l;

    iput-object p5, p0, Lq3/i;->e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    iput-boolean p6, p0, Lq3/i;->f:Z

    iput-object p7, p0, Lq3/i;->g:Ljava/lang/String;

    iput p8, p0, Lq3/i;->h:I

    iput p9, p0, Lq3/i;->i:I

    iput p10, p0, Lq3/i;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lq3/i;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lq3/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lq3/i;->c:Ljava/lang/String;

    iget-object v3, p0, Lq3/i;->d:Lx7/l;

    iget-object v4, p0, Lq3/i;->e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    iget-boolean v5, p0, Lq3/i;->f:Z

    iget-object v6, p0, Lq3/i;->g:Ljava/lang/String;

    iget v7, p0, Lq3/i;->h:I

    iget v8, p0, Lq3/i;->i:I

    iget v9, p0, Lq3/i;->j:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/zykj/lib/login/ui/teacher/pwd/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lx7/l;Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
