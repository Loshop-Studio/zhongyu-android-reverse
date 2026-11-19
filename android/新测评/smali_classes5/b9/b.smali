.class public final synthetic Lb9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/o$c;


# instance fields
.field public final synthetic a:La9/o;


# direct methods
.method public synthetic constructor <init>(La9/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b;->a:La9/o;

    return-void
.end method


# virtual methods
.method public final a(La9/e;)La9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/b;->a:La9/o;

    invoke-static {v0, p1}, Lb9/d;->a(La9/o;La9/e;)La9/o;

    move-result-object p1

    return-object p1
.end method
