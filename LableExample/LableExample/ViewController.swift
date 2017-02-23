//
//  ViewController.swift
//  LableExample
//
//  Created by Rajendra Prasad on 1/9/17.
//  Copyright © 2017 LableExample. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    
    @IBOutlet weak var welcomLBL: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        // comment is added
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBAction func buttontouchUp(_ sender: UIButton) {
        
        print("buttontouchUp");
        
        self.welcomLBL.text = "Welcome";
        self.welcomLBL.textColor = UIColor.green
    }
    
    
    @IBAction func touchDown(_ sender: UIButton) {
        
        print("touchDown")
    }


}

