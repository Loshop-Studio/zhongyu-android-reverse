.class public abstract Lv0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lretrofit2/a;

.field public static final b:Lv0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lretrofit2/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lretrofit2/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv0/e;->a:Lretrofit2/a;

    .line 8
    .line 9
    new-instance v0, Lv0/d;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lv0/e;->b:Lv0/d;

    .line 15
    .line 16
    return-void
.end method
