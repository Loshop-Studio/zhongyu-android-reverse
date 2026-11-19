.class public interface abstract Lf0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf0/h;

    .line 2
    .line 3
    sget-object v0, Lf0/h;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, Lf0/j;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lf0/j;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Lf0/g;->a:Lf0/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
