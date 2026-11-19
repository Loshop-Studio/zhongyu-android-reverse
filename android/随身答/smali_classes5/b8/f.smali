.class public final synthetic Lb8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lb8/g;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lf8/a;


# direct methods
.method public synthetic constructor <init>(Lb8/g;Ljava/lang/Object;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/f;->a:Lb8/g;

    iput-object p2, p0, Lb8/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb8/f;->c:Lf8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb8/f;->a:Lb8/g;

    iget-object v1, p0, Lb8/f;->b:Ljava/lang/Object;

    iget-object v2, p0, Lb8/f;->c:Lf8/a;

    invoke-static {v0, v1, v2}, Lb8/g;->d(Lb8/g;Ljava/lang/Object;Lf8/a;)V

    return-void
.end method
