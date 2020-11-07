const path = require('path');
const webpack = require('webpack');


module.exports = {
    entry:'./src/main.js',
    output: {
        path:path.resolve(__dirname,'dist'),
        filename:'bundle.js',
        publicPath: 'dist/',
    },
    plugins:[
        new webpack.BannerPlugin("这是yu的版权"),
    ],
    module: {
        rules: [
                {
                    test: /\.css$/,
                    use: [ 'style-loader', 'css-loader' ]
                },
                {
                    test: /\.less$/,
                    use: [
                        {
                            loader: 'style-loader',
                        },
                        {
                            loader: 'css-loader',
                        },
                        {
                            loader: 'less-loader',
                        },
                    ]
                },
                {
                    test: /\.(png|jpg|gif)$/,
                    use: [
                        {
                            loader: 'url-loader',
                            options: {
                                limit: 13000,
                                name: 'img/[name].[hash:8].[ext]',
                            }
                        }
                    ]
                }, {
                    test: /\.m?js$/,
                    exclude: /(node_modules|bower_components)/,
                    use: {
                        loader: 'babel-loader',
                        options: {
                            presets: ['es2015']
                        }
                    }
                },{
                    test:/\.vue$/,
                    use:['vue-loader']
                }
            ]
    },
    resolve:{
        alias:{
            'vue$':'vue/dist/vue.esm.js'
        }
    }
}