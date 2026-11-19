.class public abstract Lu7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu7/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu7/h;->a:Lu7/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lu7/o;Lu7/b0;)V
    .locals 0

    .line 1
    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Lu7/w;)V
.end method
