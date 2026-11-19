.class public La/h/g/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/h/g/o;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/h/i/a;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/h/g/o;La/h/i/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, La/h/g/o$a;->b:La/h/i/a;

    iput-object p3, p0, La/h/g/o$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/h/g/o$a;->b:La/h/i/a;

    iget-object v1, p0, La/h/g/o$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, La/h/i/a;->a(Ljava/lang/Object;)V

    return-void
.end method
