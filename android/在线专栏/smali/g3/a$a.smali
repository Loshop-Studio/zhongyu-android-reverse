.class public final Lg3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg3/a;->y(JLf3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf3/l;

.field final synthetic b:Lg3/a;


# direct methods
.method public constructor <init>(Lf3/l;Lg3/a;)V
    .locals 0

    iput-object p1, p0, Lg3/a$a;->a:Lf3/l;

    iput-object p2, p0, Lg3/a$a;->b:Lg3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg3/a$a;->a:Lf3/l;

    iget-object v1, p0, Lg3/a$a;->b:Lg3/a;

    sget-object v2, Lo2/r;->a:Lo2/r;

    invoke-interface {v0, v1, v2}, Lf3/l;->f(Lf3/e0;Ljava/lang/Object;)V

    return-void
.end method
